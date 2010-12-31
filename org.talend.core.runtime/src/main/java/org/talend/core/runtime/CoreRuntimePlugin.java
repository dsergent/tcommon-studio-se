// ============================================================================
//
// Copyright (C) 2006-2007 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.runtime;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;
import org.talend.core.AbstractDQModelService;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ICoreService;
import org.talend.core.IManagementService;
import org.talend.core.IService;
import org.talend.core.IStatusPreferenceInitService;
import org.talend.core.context.Context;
import org.talend.core.model.general.ILibrariesService;
import org.talend.core.service.IWebService;
import org.talend.designer.core.IDesignerCoreService;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryService;

/**
 * DOC nrousseau class global comment. Detailled comment
 */
public class CoreRuntimePlugin extends Plugin {

    public static final String PLUGIN_ID = "org.talend.core.runtime"; //$NON-NLS-1$

    /** Context. */
    private final Context context;

    private static CoreRuntimePlugin plugin = null;

    public CoreRuntimePlugin() {
        context = new Context();
    }

    public static CoreRuntimePlugin getInstance() {
        return plugin;
    }

    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    public void stop(BundleContext context) throws Exception {
        super.stop(context);
        plugin = null;
    }

    /**
     * Getter for context.
     * 
     * @return the context
     */
    public Context getContext() {
        return this.context;
    }

    public IProxyRepositoryFactory getProxyRepositoryFactory() {
        IRepositoryService service = getRepositoryService();
        return service.getProxyRepositoryFactory();
    }

    public IRepositoryService getRepositoryService() {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IRepositoryService.class)) {
            IService service = GlobalServiceRegister.getDefault().getService(IRepositoryService.class);
            return (IRepositoryService) service;
        }
        return null;
    }

    public AbstractDQModelService getDQModelService() {
        if (GlobalServiceRegister.getDefault().isDQModelServiceRegistered(AbstractDQModelService.class)) {
            IService service = GlobalServiceRegister.getDefault().getDQModelService(AbstractDQModelService.class);
            return (AbstractDQModelService) service;
        }
        return null;
    }
    public IDesignerCoreService getDesignerCoreService() {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IDesignerCoreService.class)) {
            IService service = GlobalServiceRegister.getDefault().getService(IDesignerCoreService.class);
            return (IDesignerCoreService) service;
        }
        return null;
    }

    public ICoreService getCoreService() {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(ICoreService.class)) {
            IService service = GlobalServiceRegister.getDefault().getService(ICoreService.class);
            return (ICoreService) service;
        }
        return null;
    }
    public ILibrariesService getLibrariesService() {
        return (ILibrariesService) GlobalServiceRegister.getDefault().getService(ILibrariesService.class);
    }

    public IManagementService getManagementService() {
        return (IManagementService) GlobalServiceRegister.getDefault().getService(IManagementService.class);

    }

    public IStatusPreferenceInitService getStatusPreferenceInitService() {
        return (IStatusPreferenceInitService) GlobalServiceRegister.getDefault().getService(IStatusPreferenceInitService.class);
    }

    public IWebService getWebService() {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IWebService.class)) {
            return (IWebService) GlobalServiceRegister.getDefault().getService(IWebService.class);
        }
        return null;
    }

}
