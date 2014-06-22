// ============================================================================
//
// Copyright (C) 2006-2013 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Properties;

import org.talend.commons.utils.io.FilesUtils;

/**
 * <br>
 * bqian This program can not be executed after all the projects of talend have been updated.<br/>
 * 
 * <br>
 * The following plugins have ralated nl plugins.<br>
 * 
 * <br>
 * <br>
 * org.talend.commons<br>
 * <br>
 * org.talend.core<br>
 * 
 * <br>
 * org.talend.designer.codegen<br>
 * <br>
 * org.talend.designer.components.localprovider<br>
 * <br>
 * org.talend.designer.core<br>
 * <br>
 * org.talend.designer.mapper<br>
 * <br>
 * org.talend.designer.rowgenerator<br>
 * <br>
 * org.talend.designer.runprocess<br>
 * <br>
 * org.talend.help<br>
 * <br>
 * org.talend.librariesmanager<br>
 * <br>
 * org.talend.model.edit<br>
 * <br>
 * org.talend.model<br>
 * <br>
 * org.talend.rcp<br>
 * <br>
 * org.talend.repository.localprovider<br>
 * <br>
 * org.talend.repository<br>
 * <br>
 * org.talend.scheduler<br>
 * <br>
 * org.talend.sqlbuilder<br>
 * 
 * 
 * Note that the <br>
 * org.talend.designer.business.diagram<br>
 * 
 * is special. $Id: I18NChecker.java 1 2007-07-11 17:06:40 +0000 bqian $
 * 
 */
public class I18NChecker {

    /**
     * DOC bqian Comment method "main".
     * 
     * @param args
     */
    public static void main(String[] args) {
        new I18NChecker().check();
    }

    private ArrayList<ProjectMapper> mapperList;

    private void check() {
        try {
            listProject();
            for (ProjectMapper mapper : mapperList) {
                processMapper(mapper);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // ExceptionHandler.process(e);
        }

    }

    /**
     * bqian Comment method "processMapper".
     * 
     * @param mapper
     */
    private void processMapper(ProjectMapper mapper) throws Exception {
        File project = mapper.project;
        File nlProject = mapper.mappingNLProject;

        File srcProperties = new File(project, "src/main/java/messages.properties"); //$NON-NLS-1$
        File desProperties = new File(nlProject, "src/main/java/messages_en.properties"); //$NON-NLS-1$

        File[] otherProperties = new File[] { new File(nlProject, "src/main/java/messages_zh.properties") }; //$NON-NLS-1$

        if (!srcProperties.exists() || !desProperties.exists()) {
            return;
        }
        copyContent(srcProperties, desProperties);

        // desProperties = new File(nlProject, "src/main/java/messages_en.properties");
        // merge(desProperties, otherProperties);
    }

    /**
     * bqian Comment method "compare".
     * 
     * @param desProperties
     * @param otherProperties
     */
    private void merge(File enProperties, File[] otherProperties) throws Exception {
        for (File file : otherProperties) {
            merge(enProperties, file);
        }
    }

    private void merge(File enProperties, File otherProperties) throws Exception {
        // store the english Properties
        Properties enPro = new Properties();
        enPro.load(new FileInputStream(enProperties));
        // store other language Properties
        Properties otherPro = new Properties();
        otherPro.load(new FileInputStream(otherProperties));

        // Add the key that otherPro lacks.
        for (Object element : enPro.keySet()) {
            String enKey = (String) element;

            if (!otherPro.containsKey(enKey)) {
                otherPro.put(enKey, ""); //$NON-NLS-1$
            }
        }

        // Remove the key that is redundant in otherPro.
        for (Object element : otherPro.keySet()) {
            String otherKey = (String) element;

            if (!enPro.containsKey(otherKey)) {
                otherPro.remove(otherKey);
            }
        }

        otherPro.store(new FileOutputStream(otherProperties), "Generated by I18NChecker"); //$NON-NLS-1$
    }

    /**
     * bqian Comment method "copyContent".
     * 
     * @param srcProperties
     * @param desProperties
     */
    private void copyContent(File srcProperties, File desProperties) throws Exception {
        FilesUtils.copyFile(new FileInputStream(srcProperties), desProperties);
    }

    /**
     * DOC bqian Comment method "listProject".
     */
    private void listProject() {
        File[] projects = null;

        File[] nlProjects = null;

        File file = new File(""); //$NON-NLS-1$

        File workspace = new File(file.getAbsolutePath() + "/../"); //$NON-NLS-1$
        projects = workspace.listFiles(projectFilter);
        nlProjects = workspace.listFiles(nlProjectFilter);

        mapperList = new ArrayList<ProjectMapper>();
        for (File project : projects) {
            File nlproject = null;
            for (File nlProject2 : nlProjects) {
                if (nlProject2.getName().equals(project.getName() + ".nl")) { //$NON-NLS-1$
                    nlproject = nlProject2;
                    break;
                }
            }
            if (nlproject != null) {
                ProjectMapper mapper = new ProjectMapper();
                mapper.project = project;
                mapper.mappingNLProject = nlproject;
                mapperList.add(mapper);
            }
        }

        // for (ProjectMapper mapper : mapperList) {
        // System.out.println(mapper);
        // }
    }

    FilenameFilter projectFilter = new FilenameFilter() {

        @Override
        public boolean accept(File dir, String name) {
            if (!name.startsWith("org.talend.")) { //$NON-NLS-1$
                return false;
            }
            if (name.endsWith(".nl")) { //$NON-NLS-1$
                return false;
            }
            return true;
        }
    };

    FilenameFilter nlProjectFilter = new FilenameFilter() {

        @Override
        public boolean accept(File dir, String name) {
            return name.startsWith("org.talend.") && name.endsWith(".nl"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    };

    /**
     * 
     * <br/>
     * 
     * $Id: talend.epf 1 2006-09-29 17:06:40 +0000 (ææäº, 29 ä¹æ 2006) nrousseau $
     * 
     */
    class ProjectMapper {

        File project;

        File mappingNLProject;

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString() {
            return project + "-------" + mappingNLProject; //$NON-NLS-1$
        }
    }

}
