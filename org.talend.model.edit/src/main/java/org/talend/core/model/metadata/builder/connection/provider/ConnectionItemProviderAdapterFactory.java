/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.metadata.builder.connection.provider;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.metadata.builder.connection.util.ConnectionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionItemProviderAdapterFactory extends ConnectionAdapterFactory implements ComposeableAdapterFactory,
        IChangeNotifier, IDisposable, IChildCreationExtender {

    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This helps manage the child creation extenders.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
            MetadataEditPlugin.INSTANCE, ConnectionPackage.eNS_URI);

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.Metadata} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MetadataItemProvider metadataItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.Metadata}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMetadataAdapter() {
        if (metadataItemProvider == null) {
            metadataItemProvider = new MetadataItemProvider(this);
        }

        return metadataItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.Connection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectionItemProvider connectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.Connection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createConnectionAdapter() {
        if (connectionItemProvider == null) {
            connectionItemProvider = new ConnectionItemProvider(this);
        }

        return connectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.MetadataColumn} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MetadataColumnItemProvider metadataColumnItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.MetadataColumn}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMetadataColumnAdapter() {
        if (metadataColumnItemProvider == null) {
            metadataColumnItemProvider = new MetadataColumnItemProvider(this);
        }

        return metadataColumnItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.MetadataTable} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MetadataTableItemProvider metadataTableItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.MetadataTable}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMetadataTableAdapter() {
        if (metadataTableItemProvider == null) {
            metadataTableItemProvider = new MetadataTableItemProvider(this);
        }

        return metadataTableItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.DelimitedFileConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DelimitedFileConnectionItemProvider delimitedFileConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.DelimitedFileConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDelimitedFileConnectionAdapter() {
        if (delimitedFileConnectionItemProvider == null) {
            delimitedFileConnectionItemProvider = new DelimitedFileConnectionItemProvider(this);
        }

        return delimitedFileConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.PositionalFileConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PositionalFileConnectionItemProvider positionalFileConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.PositionalFileConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPositionalFileConnectionAdapter() {
        if (positionalFileConnectionItemProvider == null) {
            positionalFileConnectionItemProvider = new PositionalFileConnectionItemProvider(this);
        }

        return positionalFileConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.EbcdicConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EbcdicConnectionItemProvider ebcdicConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.EbcdicConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEbcdicConnectionAdapter() {
        if (ebcdicConnectionItemProvider == null) {
            ebcdicConnectionItemProvider = new EbcdicConnectionItemProvider(this);
        }

        return ebcdicConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.MDMConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MDMConnectionItemProvider mdmConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.MDMConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMDMConnectionAdapter() {
        if (mdmConnectionItemProvider == null) {
            mdmConnectionItemProvider = new MDMConnectionItemProvider(this);
        }

        return mdmConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.DatabaseConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatabaseConnectionItemProvider databaseConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.DatabaseConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDatabaseConnectionAdapter() {
        if (databaseConnectionItemProvider == null) {
            databaseConnectionItemProvider = new DatabaseConnectionItemProvider(this);
        }

        return databaseConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.SAPConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPConnectionItemProvider sapConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.SAPConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSAPConnectionAdapter() {
        if (sapConnectionItemProvider == null) {
            sapConnectionItemProvider = new SAPConnectionItemProvider(this);
        }

        return sapConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.SAPFunctionUnit} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPFunctionUnitItemProvider sapFunctionUnitItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.SAPFunctionUnit}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSAPFunctionUnitAdapter() {
        if (sapFunctionUnitItemProvider == null) {
            sapFunctionUnitItemProvider = new SAPFunctionUnitItemProvider(this);
        }

        return sapFunctionUnitItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPFunctionParameterColumnItemProvider sapFunctionParameterColumnItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSAPFunctionParameterColumnAdapter() {
        if (sapFunctionParameterColumnItemProvider == null) {
            sapFunctionParameterColumnItemProvider = new SAPFunctionParameterColumnItemProvider(this);
        }

        return sapFunctionParameterColumnItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterTable} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPFunctionParameterTableItemProvider sapFunctionParameterTableItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterTable}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSAPFunctionParameterTableAdapter() {
        if (sapFunctionParameterTableItemProvider == null) {
            sapFunctionParameterTableItemProvider = new SAPFunctionParameterTableItemProvider(this);
        }

        return sapFunctionParameterTableItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.InputSAPFunctionParameterTable} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InputSAPFunctionParameterTableItemProvider inputSAPFunctionParameterTableItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.InputSAPFunctionParameterTable}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createInputSAPFunctionParameterTableAdapter() {
        if (inputSAPFunctionParameterTableItemProvider == null) {
            inputSAPFunctionParameterTableItemProvider = new InputSAPFunctionParameterTableItemProvider(this);
        }

        return inputSAPFunctionParameterTableItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.OutputSAPFunctionParameterTable} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutputSAPFunctionParameterTableItemProvider outputSAPFunctionParameterTableItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.OutputSAPFunctionParameterTable}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createOutputSAPFunctionParameterTableAdapter() {
        if (outputSAPFunctionParameterTableItemProvider == null) {
            outputSAPFunctionParameterTableItemProvider = new OutputSAPFunctionParameterTableItemProvider(this);
        }

        return outputSAPFunctionParameterTableItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.RegexpFileConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RegexpFileConnectionItemProvider regexpFileConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.RegexpFileConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRegexpFileConnectionAdapter() {
        if (regexpFileConnectionItemProvider == null) {
            regexpFileConnectionItemProvider = new RegexpFileConnectionItemProvider(this);
        }

        return regexpFileConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.XmlFileConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XmlFileConnectionItemProvider xmlFileConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.XmlFileConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createXmlFileConnectionAdapter() {
        if (xmlFileConnectionItemProvider == null) {
            xmlFileConnectionItemProvider = new XmlFileConnectionItemProvider(this);
        }

        return xmlFileConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.SchemaTarget} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SchemaTargetItemProvider schemaTargetItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.SchemaTarget}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSchemaTargetAdapter() {
        if (schemaTargetItemProvider == null) {
            schemaTargetItemProvider = new SchemaTargetItemProvider(this);
        }

        return schemaTargetItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.QueriesConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QueriesConnectionItemProvider queriesConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.QueriesConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createQueriesConnectionAdapter() {
        if (queriesConnectionItemProvider == null) {
            queriesConnectionItemProvider = new QueriesConnectionItemProvider(this);
        }

        return queriesConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.Query} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QueryItemProvider queryItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.Query}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createQueryAdapter() {
        if (queryItemProvider == null) {
            queryItemProvider = new QueryItemProvider(this);
        }

        return queryItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.LdifFileConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LdifFileConnectionItemProvider ldifFileConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.LdifFileConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createLdifFileConnectionAdapter() {
        if (ldifFileConnectionItemProvider == null) {
            ldifFileConnectionItemProvider = new LdifFileConnectionItemProvider(this);
        }

        return ldifFileConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.FileExcelConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FileExcelConnectionItemProvider fileExcelConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.FileExcelConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFileExcelConnectionAdapter() {
        if (fileExcelConnectionItemProvider == null) {
            fileExcelConnectionItemProvider = new FileExcelConnectionItemProvider(this);
        }

        return fileExcelConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.XmlXPathLoopDescriptor} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XmlXPathLoopDescriptorItemProvider xmlXPathLoopDescriptorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.XmlXPathLoopDescriptor}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createXmlXPathLoopDescriptorAdapter() {
        if (xmlXPathLoopDescriptorItemProvider == null) {
            xmlXPathLoopDescriptorItemProvider = new XmlXPathLoopDescriptorItemProvider(this);
        }

        return xmlXPathLoopDescriptorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.GenericSchemaConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenericSchemaConnectionItemProvider genericSchemaConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.GenericSchemaConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createGenericSchemaConnectionAdapter() {
        if (genericSchemaConnectionItemProvider == null) {
            genericSchemaConnectionItemProvider = new GenericSchemaConnectionItemProvider(this);
        }

        return genericSchemaConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LDAPSchemaConnectionItemProvider ldapSchemaConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createLDAPSchemaConnectionAdapter() {
        if (ldapSchemaConnectionItemProvider == null) {
            ldapSchemaConnectionItemProvider = new LDAPSchemaConnectionItemProvider(this);
        }

        return ldapSchemaConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WSDLSchemaConnectionItemProvider wsdlSchemaConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createWSDLSchemaConnectionAdapter() {
        if (wsdlSchemaConnectionItemProvider == null) {
            wsdlSchemaConnectionItemProvider = new WSDLSchemaConnectionItemProvider(this);
        }

        return wsdlSchemaConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SalesforceSchemaConnectionItemProvider salesforceSchemaConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSalesforceSchemaConnectionAdapter() {
        if (salesforceSchemaConnectionItemProvider == null) {
            salesforceSchemaConnectionItemProvider = new SalesforceSchemaConnectionItemProvider(this);
        }

        return salesforceSchemaConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.CDCConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CDCConnectionItemProvider cdcConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.CDCConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCDCConnectionAdapter() {
        if (cdcConnectionItemProvider == null) {
            cdcConnectionItemProvider = new CDCConnectionItemProvider(this);
        }

        return cdcConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.CDCType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CDCTypeItemProvider cdcTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.CDCType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCDCTypeAdapter() {
        if (cdcTypeItemProvider == null) {
            cdcTypeItemProvider = new CDCTypeItemProvider(this);
        }

        return cdcTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.SubscriberTable} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubscriberTableItemProvider subscriberTableItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.SubscriberTable}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSubscriberTableAdapter() {
        if (subscriberTableItemProvider == null) {
            subscriberTableItemProvider = new SubscriberTableItemProvider(this);
        }

        return subscriberTableItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.SAPTestInputParameterTable} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPTestInputParameterTableItemProvider sapTestInputParameterTableItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.SAPTestInputParameterTable}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSAPTestInputParameterTableAdapter() {
        if (sapTestInputParameterTableItemProvider == null) {
            sapTestInputParameterTableItemProvider = new SAPTestInputParameterTableItemProvider(this);
        }

        return sapTestInputParameterTableItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.Concept} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConceptItemProvider conceptItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.Concept}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createConceptAdapter() {
        if (conceptItemProvider == null) {
            conceptItemProvider = new ConceptItemProvider(this);
        }

        return conceptItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.ConceptTarget} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConceptTargetItemProvider conceptTargetItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.ConceptTarget}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createConceptTargetAdapter() {
        if (conceptTargetItemProvider == null) {
            conceptTargetItemProvider = new ConceptTargetItemProvider(this);
        }

        return conceptTargetItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.HL7Connection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HL7ConnectionItemProvider hl7ConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.HL7Connection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createHL7ConnectionAdapter() {
        if (hl7ConnectionItemProvider == null) {
            hl7ConnectionItemProvider = new HL7ConnectionItemProvider(this);
        }

        return hl7ConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.core.model.metadata.builder.connection.GenericPackage} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenericPackageItemProvider genericPackageItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.core.model.metadata.builder.connection.GenericPackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createGenericPackageAdapter() {
        if (genericPackageItemProvider == null) {
            genericPackageItemProvider = new GenericPackageItemProvider(this);
        }

        return genericPackageItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<IChildCreationExtender> getChildCreationExtenders() {
        return childCreationExtenderManager.getChildCreationExtenders();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
        return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator() {
        return childCreationExtenderManager;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (metadataItemProvider != null)
            metadataItemProvider.dispose();
        if (connectionItemProvider != null)
            connectionItemProvider.dispose();
        if (metadataColumnItemProvider != null)
            metadataColumnItemProvider.dispose();
        if (metadataTableItemProvider != null)
            metadataTableItemProvider.dispose();
        if (delimitedFileConnectionItemProvider != null)
            delimitedFileConnectionItemProvider.dispose();
        if (positionalFileConnectionItemProvider != null)
            positionalFileConnectionItemProvider.dispose();
        if (ebcdicConnectionItemProvider != null)
            ebcdicConnectionItemProvider.dispose();
        if (mdmConnectionItemProvider != null)
            mdmConnectionItemProvider.dispose();
        if (databaseConnectionItemProvider != null)
            databaseConnectionItemProvider.dispose();
        if (sapConnectionItemProvider != null)
            sapConnectionItemProvider.dispose();
        if (sapFunctionUnitItemProvider != null)
            sapFunctionUnitItemProvider.dispose();
        if (sapFunctionParameterColumnItemProvider != null)
            sapFunctionParameterColumnItemProvider.dispose();
        if (sapFunctionParameterTableItemProvider != null)
            sapFunctionParameterTableItemProvider.dispose();
        if (inputSAPFunctionParameterTableItemProvider != null)
            inputSAPFunctionParameterTableItemProvider.dispose();
        if (outputSAPFunctionParameterTableItemProvider != null)
            outputSAPFunctionParameterTableItemProvider.dispose();
        if (regexpFileConnectionItemProvider != null)
            regexpFileConnectionItemProvider.dispose();
        if (xmlFileConnectionItemProvider != null)
            xmlFileConnectionItemProvider.dispose();
        if (schemaTargetItemProvider != null)
            schemaTargetItemProvider.dispose();
        if (queriesConnectionItemProvider != null)
            queriesConnectionItemProvider.dispose();
        if (queryItemProvider != null)
            queryItemProvider.dispose();
        if (ldifFileConnectionItemProvider != null)
            ldifFileConnectionItemProvider.dispose();
        if (fileExcelConnectionItemProvider != null)
            fileExcelConnectionItemProvider.dispose();
        if (xmlXPathLoopDescriptorItemProvider != null)
            xmlXPathLoopDescriptorItemProvider.dispose();
        if (genericSchemaConnectionItemProvider != null)
            genericSchemaConnectionItemProvider.dispose();
        if (ldapSchemaConnectionItemProvider != null)
            ldapSchemaConnectionItemProvider.dispose();
        if (wsdlSchemaConnectionItemProvider != null)
            wsdlSchemaConnectionItemProvider.dispose();
        if (salesforceSchemaConnectionItemProvider != null)
            salesforceSchemaConnectionItemProvider.dispose();
        if (cdcConnectionItemProvider != null)
            cdcConnectionItemProvider.dispose();
        if (cdcTypeItemProvider != null)
            cdcTypeItemProvider.dispose();
        if (subscriberTableItemProvider != null)
            subscriberTableItemProvider.dispose();
        if (sapTestInputParameterTableItemProvider != null)
            sapTestInputParameterTableItemProvider.dispose();
        if (conceptItemProvider != null)
            conceptItemProvider.dispose();
        if (conceptTargetItemProvider != null)
            conceptTargetItemProvider.dispose();
        if (hl7ConnectionItemProvider != null)
            hl7ConnectionItemProvider.dispose();
        if (genericPackageItemProvider != null)
            genericPackageItemProvider.dispose();
    }

}
