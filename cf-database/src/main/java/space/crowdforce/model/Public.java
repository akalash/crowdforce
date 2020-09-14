/*
 * This file is generated by jOOQ.
 */
package space.crowdforce.model;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import space.crowdforce.model.tables.Activities;
import space.crowdforce.model.tables.ActivityParticipants;
import space.crowdforce.model.tables.FlywaySchemaHistory;
import space.crowdforce.model.tables.Goals;
import space.crowdforce.model.tables.ProjectSubscribers;
import space.crowdforce.model.tables.Projects;
import space.crowdforce.model.tables.Users;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -587601609;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.activities</code>.
     */
    public final Activities ACTIVITIES = Activities.ACTIVITIES;

    /**
     * The table <code>public.activity_participants</code>.
     */
    public final ActivityParticipants ACTIVITY_PARTICIPANTS = ActivityParticipants.ACTIVITY_PARTICIPANTS;

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.goals</code>.
     */
    public final Goals GOALS = Goals.GOALS;

    /**
     * The table <code>public.project_subscribers</code>.
     */
    public final ProjectSubscribers PROJECT_SUBSCRIBERS = ProjectSubscribers.PROJECT_SUBSCRIBERS;

    /**
     * The table <code>public.projects</code>.
     */
    public final Projects PROJECTS = Projects.PROJECTS;

    /**
     * The table <code>public.users</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        return Arrays.<Sequence<?>>asList(
            Sequences.ACTIVITIES_ID_SEQ,
            Sequences.GOALS_ID_SEQ,
            Sequences.PROJECTS_ID_SEQ,
            Sequences.USERS_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Activities.ACTIVITIES,
            ActivityParticipants.ACTIVITY_PARTICIPANTS,
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            Goals.GOALS,
            ProjectSubscribers.PROJECT_SUBSCRIBERS,
            Projects.PROJECTS,
            Users.USERS);
    }
}
