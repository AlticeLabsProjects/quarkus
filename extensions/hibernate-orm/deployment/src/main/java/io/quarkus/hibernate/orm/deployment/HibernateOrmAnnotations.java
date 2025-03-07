package io.quarkus.hibernate.orm.deployment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.jboss.jandex.DotName;

public final class HibernateOrmAnnotations {

    private HibernateOrmAnnotations() {
    }

    public static final List<DotName> PACKAGE_ANNOTATIONS = Collections.unmodifiableList(Arrays.asList(
            DotName.createSimple("org.hibernate.annotations.AnyMetaDef"),
            DotName.createSimple("org.hibernate.annotations.AnyMetaDefs"),
            DotName.createSimple("org.hibernate.annotations.FetchProfile"),
            DotName.createSimple("org.hibernate.annotations.FetchProfile$FetchOverride"),
            DotName.createSimple("org.hibernate.annotations.FetchProfiles"),
            DotName.createSimple("org.hibernate.annotations.FilterDef"),
            DotName.createSimple("org.hibernate.annotations.FilterDefs"),
            DotName.createSimple("org.hibernate.annotations.GenericGenerator"),
            DotName.createSimple("org.hibernate.annotations.GenericGenerators"),
            DotName.createSimple("org.hibernate.annotations.ListIndexBase"),
            DotName.createSimple("org.hibernate.annotations.NamedNativeQueries"),
            DotName.createSimple("org.hibernate.annotations.NamedNativeQuery"),
            DotName.createSimple("org.hibernate.annotations.NamedQueries"),
            DotName.createSimple("org.hibernate.annotations.NamedQuery"),
            DotName.createSimple("org.hibernate.annotations.TypeDef"),
            DotName.createSimple("org.hibernate.annotations.TypeDefs")));

    public static final List<DotName> JPA_MAPPING_ANNOTATIONS = Collections.unmodifiableList(Arrays.asList(
            DotName.createSimple("javax.persistence.Access"),
            DotName.createSimple("javax.persistence.AssociationOverride"),
            DotName.createSimple("javax.persistence.AssociationOverrides"),
            DotName.createSimple("javax.persistence.AttributeOverride"),
            DotName.createSimple("javax.persistence.AttributeOverrides"),
            DotName.createSimple("javax.persistence.Basic"),
            DotName.createSimple("javax.persistence.Cacheable"),
            DotName.createSimple("javax.persistence.CollectionTable"),
            DotName.createSimple("javax.persistence.Column"),
            DotName.createSimple("javax.persistence.ColumnResult"),
            DotName.createSimple("javax.persistence.ConstructorResult"),
            DotName.createSimple("javax.persistence.Convert"),
            DotName.createSimple("javax.persistence.Converter"),
            DotName.createSimple("javax.persistence.Converts"),
            DotName.createSimple("javax.persistence.DiscriminatorColumn"),
            DotName.createSimple("javax.persistence.DiscriminatorValue"),
            DotName.createSimple("javax.persistence.ElementCollection"),
            DotName.createSimple("javax.persistence.Embeddable"),
            DotName.createSimple("javax.persistence.Embedded"),
            DotName.createSimple("javax.persistence.EmbeddedId"),
            DotName.createSimple("javax.persistence.Entity"),
            DotName.createSimple("javax.persistence.EntityListeners"),
            DotName.createSimple("javax.persistence.EntityResult"),
            DotName.createSimple("javax.persistence.Enumerated"),
            DotName.createSimple("javax.persistence.ExcludeDefaultListeners"),
            DotName.createSimple("javax.persistence.ExcludeSuperclassListeners"),
            DotName.createSimple("javax.persistence.FieldResult"),
            DotName.createSimple("javax.persistence.ForeignKey"),
            DotName.createSimple("javax.persistence.GeneratedValue"),
            DotName.createSimple("javax.persistence.Id"),
            DotName.createSimple("javax.persistence.IdClass"),
            DotName.createSimple("javax.persistence.Index"),
            DotName.createSimple("javax.persistence.Inheritance"),
            DotName.createSimple("javax.persistence.JoinColumn"),
            DotName.createSimple("javax.persistence.JoinColumns"),
            DotName.createSimple("javax.persistence.JoinTable"),
            DotName.createSimple("javax.persistence.Lob"),
            DotName.createSimple("javax.persistence.ManyToMany"),
            DotName.createSimple("javax.persistence.ManyToOne"),
            DotName.createSimple("javax.persistence.MapKey"),
            DotName.createSimple("javax.persistence.MapKeyClass"),
            DotName.createSimple("javax.persistence.MapKeyColumn"),
            DotName.createSimple("javax.persistence.MapKeyEnumerated"),
            DotName.createSimple("javax.persistence.MapKeyJoinColumn"),
            DotName.createSimple("javax.persistence.MapKeyJoinColumns"),
            DotName.createSimple("javax.persistence.MapKeyTemporal"),
            DotName.createSimple("javax.persistence.MappedSuperclass"),
            DotName.createSimple("javax.persistence.MapsId"),
            DotName.createSimple("javax.persistence.NamedAttributeNode"),
            DotName.createSimple("javax.persistence.NamedEntityGraph"),
            DotName.createSimple("javax.persistence.NamedEntityGraphs"),
            DotName.createSimple("javax.persistence.NamedNativeQueries"),
            DotName.createSimple("javax.persistence.NamedNativeQuery"),
            DotName.createSimple("javax.persistence.NamedQueries"),
            DotName.createSimple("javax.persistence.NamedQuery"),
            DotName.createSimple("javax.persistence.NamedStoredProcedureQueries"),
            DotName.createSimple("javax.persistence.NamedStoredProcedureQuery"),
            DotName.createSimple("javax.persistence.NamedSubgraph"),
            DotName.createSimple("javax.persistence.OneToMany"),
            DotName.createSimple("javax.persistence.OneToOne"),
            DotName.createSimple("javax.persistence.OrderBy"),
            DotName.createSimple("javax.persistence.OrderColumn"),
            DotName.createSimple("javax.persistence.PersistenceContext"),
            DotName.createSimple("javax.persistence.PersistenceContexts"),
            DotName.createSimple("javax.persistence.PersistenceProperty"),
            DotName.createSimple("javax.persistence.PersistenceUnit"),
            DotName.createSimple("javax.persistence.PersistenceUnits"),
            DotName.createSimple("javax.persistence.PostLoad"),
            DotName.createSimple("javax.persistence.PostPersist"),
            DotName.createSimple("javax.persistence.PostRemove"),
            DotName.createSimple("javax.persistence.PostUpdate"),
            DotName.createSimple("javax.persistence.PrePersist"),
            DotName.createSimple("javax.persistence.PreRemove"),
            DotName.createSimple("javax.persistence.PreUpdate"),
            DotName.createSimple("javax.persistence.PrimaryKeyJoinColumn"),
            DotName.createSimple("javax.persistence.PrimaryKeyJoinColumns"),
            DotName.createSimple("javax.persistence.QueryHint"),
            DotName.createSimple("javax.persistence.SecondaryTable"),
            DotName.createSimple("javax.persistence.SecondaryTables"),
            DotName.createSimple("javax.persistence.SequenceGenerator"),
            DotName.createSimple("javax.persistence.SequenceGenerators"),
            DotName.createSimple("javax.persistence.SqlResultSetMapping"),
            DotName.createSimple("javax.persistence.SqlResultSetMappings"),
            DotName.createSimple("javax.persistence.StoredProcedureParameter"),
            DotName.createSimple("javax.persistence.Table"),
            DotName.createSimple("javax.persistence.TableGenerator"),
            DotName.createSimple("javax.persistence.TableGenerators"),
            DotName.createSimple("javax.persistence.Temporal"),
            DotName.createSimple("javax.persistence.Transient"),
            DotName.createSimple("javax.persistence.UniqueConstraint"),
            DotName.createSimple("javax.persistence.Version")));

    public static final List<DotName> HIBERNATE_MAPPING_ANNOTATIONS = Collections.unmodifiableList(Arrays.asList(
            DotName.createSimple("org.hibernate.annotations.AccessType"),
            DotName.createSimple("org.hibernate.annotations.Any"),
            DotName.createSimple("org.hibernate.annotations.AnyMetaDef"),
            DotName.createSimple("org.hibernate.annotations.AnyMetaDefs"),
            DotName.createSimple("org.hibernate.annotations.AttributeAccessor"),
            DotName.createSimple("org.hibernate.annotations.BatchSize"),
            DotName.createSimple("org.hibernate.annotations.Cache"),
            DotName.createSimple("org.hibernate.annotations.Cascade"),
            DotName.createSimple("org.hibernate.annotations.Check"),
            DotName.createSimple("org.hibernate.annotations.CollectionId"),
            DotName.createSimple("org.hibernate.annotations.CollectionType"),
            DotName.createSimple("org.hibernate.annotations.ColumnDefault"),
            DotName.createSimple("org.hibernate.annotations.ColumnTransformer"),
            DotName.createSimple("org.hibernate.annotations.ColumnTransformers"),
            DotName.createSimple("org.hibernate.annotations.Columns"),
            DotName.createSimple("org.hibernate.annotations.Comment"),
            DotName.createSimple("org.hibernate.annotations.CreationTimestamp"),
            DotName.createSimple("org.hibernate.annotations.DiscriminatorFormula"),
            DotName.createSimple("org.hibernate.annotations.DiscriminatorOptions"),
            DotName.createSimple("org.hibernate.annotations.DynamicInsert"),
            DotName.createSimple("org.hibernate.annotations.DynamicUpdate"),
            DotName.createSimple("org.hibernate.annotations.Entity"),
            DotName.createSimple("org.hibernate.annotations.Fetch"),
            DotName.createSimple("org.hibernate.annotations.FetchProfile"),
            DotName.createSimple("org.hibernate.annotations.FetchProfile$FetchOverride"),
            DotName.createSimple("org.hibernate.annotations.FetchProfiles"),
            DotName.createSimple("org.hibernate.annotations.Filter"),
            DotName.createSimple("org.hibernate.annotations.FilterDef"),
            DotName.createSimple("org.hibernate.annotations.FilterDefs"),
            DotName.createSimple("org.hibernate.annotations.FilterJoinTable"),
            DotName.createSimple("org.hibernate.annotations.FilterJoinTables"),
            DotName.createSimple("org.hibernate.annotations.Filters"),
            DotName.createSimple("org.hibernate.annotations.ForeignKey"),
            DotName.createSimple("org.hibernate.annotations.Formula"),
            DotName.createSimple("org.hibernate.annotations.Generated"),
            DotName.createSimple("org.hibernate.annotations.GeneratorType"),
            DotName.createSimple("org.hibernate.annotations.GenericGenerator"),
            DotName.createSimple("org.hibernate.annotations.GenericGenerators"),
            DotName.createSimple("org.hibernate.annotations.Immutable"),
            DotName.createSimple("org.hibernate.annotations.Index"),
            DotName.createSimple("org.hibernate.annotations.IndexColumn"),
            DotName.createSimple("org.hibernate.annotations.JoinColumnOrFormula"),
            DotName.createSimple("org.hibernate.annotations.JoinColumnsOrFormulas"),
            DotName.createSimple("org.hibernate.annotations.JoinFormula"),
            DotName.createSimple("org.hibernate.annotations.LazyCollection"),
            DotName.createSimple("org.hibernate.annotations.LazyGroup"),
            DotName.createSimple("org.hibernate.annotations.LazyToOne"),
            DotName.createSimple("org.hibernate.annotations.ListIndexBase"),
            DotName.createSimple("org.hibernate.annotations.Loader"),
            DotName.createSimple("org.hibernate.annotations.ManyToAny"),
            DotName.createSimple("org.hibernate.annotations.MapKeyType"),
            DotName.createSimple("org.hibernate.annotations.NamedNativeQueries"),
            DotName.createSimple("org.hibernate.annotations.NamedNativeQuery"),
            DotName.createSimple("org.hibernate.annotations.NamedQueries"),
            DotName.createSimple("org.hibernate.annotations.NamedQuery"),
            DotName.createSimple("org.hibernate.annotations.Nationalized"),
            DotName.createSimple("org.hibernate.annotations.NaturalId"),
            DotName.createSimple("org.hibernate.annotations.NaturalIdCache"),
            DotName.createSimple("org.hibernate.annotations.NotFound"),
            DotName.createSimple("org.hibernate.annotations.OnDelete"),
            DotName.createSimple("org.hibernate.annotations.OptimisticLock"),
            DotName.createSimple("org.hibernate.annotations.OptimisticLocking"),
            DotName.createSimple("org.hibernate.annotations.OrderBy"),
            DotName.createSimple("org.hibernate.annotations.ParamDef"),
            DotName.createSimple("org.hibernate.annotations.Parameter"),
            DotName.createSimple("org.hibernate.annotations.Parent"),
            DotName.createSimple("org.hibernate.annotations.Persister"),
            DotName.createSimple("org.hibernate.annotations.Polymorphism"),
            DotName.createSimple("org.hibernate.annotations.Proxy"),
            DotName.createSimple("org.hibernate.annotations.RowId"),
            DotName.createSimple("org.hibernate.annotations.SQLDelete"),
            DotName.createSimple("org.hibernate.annotations.SQLDeleteAll"),
            DotName.createSimple("org.hibernate.annotations.SQLInsert"),
            DotName.createSimple("org.hibernate.annotations.SQLUpdate"),
            DotName.createSimple("org.hibernate.annotations.SelectBeforeUpdate"),
            DotName.createSimple("org.hibernate.annotations.Sort"),
            DotName.createSimple("org.hibernate.annotations.SortComparator"),
            DotName.createSimple("org.hibernate.annotations.SortNatural"),
            DotName.createSimple("org.hibernate.annotations.Source"),
            DotName.createSimple("org.hibernate.annotations.SqlFragmentAlias"),
            DotName.createSimple("org.hibernate.annotations.Subselect"),
            DotName.createSimple("org.hibernate.annotations.Synchronize"),
            DotName.createSimple("org.hibernate.annotations.Table"),
            DotName.createSimple("org.hibernate.annotations.Tables"),
            DotName.createSimple("org.hibernate.annotations.Target"),
            DotName.createSimple("org.hibernate.annotations.Tuplizer"),
            DotName.createSimple("org.hibernate.annotations.Tuplizers"),
            DotName.createSimple("org.hibernate.annotations.Type"),
            DotName.createSimple("org.hibernate.annotations.TypeDef"),
            DotName.createSimple("org.hibernate.annotations.TypeDefs"),
            DotName.createSimple("org.hibernate.annotations.UpdateTimestamp"),
            DotName.createSimple("org.hibernate.annotations.ValueGenerationType"),
            DotName.createSimple("org.hibernate.annotations.Where"),
            DotName.createSimple("org.hibernate.annotations.WhereJoinTable")));

    public static final List<DotName> ANNOTATED_WITH_INJECT_SERVICE = Collections.unmodifiableList(Arrays.asList(
            DotName.createSimple("org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl"),
            DotName.createSimple("org.hibernate.engine.jdbc.cursor.internal.StandardRefCursorSupport")));

}
