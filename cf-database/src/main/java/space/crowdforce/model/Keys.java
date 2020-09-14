/*
 * This file is generated by jOOQ.
 */
package space.crowdforce.model;


import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import space.crowdforce.model.tables.Activities;
import space.crowdforce.model.tables.ActivityParticipants;
import space.crowdforce.model.tables.FlywaySchemaHistory;
import space.crowdforce.model.tables.Goals;
import space.crowdforce.model.tables.ProjectSubscribers;
import space.crowdforce.model.tables.Projects;
import space.crowdforce.model.tables.Users;
import space.crowdforce.model.tables.records.ActivitiesRecord;
import space.crowdforce.model.tables.records.ActivityParticipantsRecord;
import space.crowdforce.model.tables.records.FlywaySchemaHistoryRecord;
import space.crowdforce.model.tables.records.GoalsRecord;
import space.crowdforce.model.tables.records.ProjectSubscribersRecord;
import space.crowdforce.model.tables.records.ProjectsRecord;
import space.crowdforce.model.tables.records.UsersRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ActivitiesRecord, Integer> IDENTITY_ACTIVITIES = Identities0.IDENTITY_ACTIVITIES;
    public static final Identity<GoalsRecord, Integer> IDENTITY_GOALS = Identities0.IDENTITY_GOALS;
    public static final Identity<ProjectsRecord, Integer> IDENTITY_PROJECTS = Identities0.IDENTITY_PROJECTS;
    public static final Identity<UsersRecord, Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ActivitiesRecord> ACTIVITIES_PKEY = UniqueKeys0.ACTIVITIES_PKEY;
    public static final UniqueKey<ActivitiesRecord> ACTIVITIES_NAME_KEY = UniqueKeys0.ACTIVITIES_NAME_KEY;
    public static final UniqueKey<ActivityParticipantsRecord> ACTIVITY_PARTICIPANTS_USER_ID_ACTIVITY_ID_KEY = UniqueKeys0.ACTIVITY_PARTICIPANTS_USER_ID_ACTIVITY_ID_KEY;
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<GoalsRecord> GOALS_PKEY = UniqueKeys0.GOALS_PKEY;
    public static final UniqueKey<ProjectSubscribersRecord> PROJECT_SUBSCRIBERS_USER_ID_PROJECT_ID_KEY = UniqueKeys0.PROJECT_SUBSCRIBERS_USER_ID_PROJECT_ID_KEY;
    public static final UniqueKey<ProjectsRecord> PROJECTS_PKEY = UniqueKeys0.PROJECTS_PKEY;
    public static final UniqueKey<ProjectsRecord> PROJECTS_NAME_KEY = UniqueKeys0.PROJECTS_NAME_KEY;
    public static final UniqueKey<UsersRecord> USERS_PKEY = UniqueKeys0.USERS_PKEY;
    public static final UniqueKey<UsersRecord> USERS_NAME_KEY = UniqueKeys0.USERS_NAME_KEY;
    public static final UniqueKey<UsersRecord> USERS_TG_ID_KEY = UniqueKeys0.USERS_TG_ID_KEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ActivitiesRecord, ProjectsRecord> ACTIVITIES__ACTIVITIES_PROJECT_ID_FKEY = ForeignKeys0.ACTIVITIES__ACTIVITIES_PROJECT_ID_FKEY;
    public static final ForeignKey<ActivityParticipantsRecord, ActivitiesRecord> ACTIVITY_PARTICIPANTS__ACTIVITY_PARTICIPANTS_ACTIVITY_ID_FKEY = ForeignKeys0.ACTIVITY_PARTICIPANTS__ACTIVITY_PARTICIPANTS_ACTIVITY_ID_FKEY;
    public static final ForeignKey<ActivityParticipantsRecord, UsersRecord> ACTIVITY_PARTICIPANTS__ACTIVITY_PARTICIPANTS_USER_ID_FKEY = ForeignKeys0.ACTIVITY_PARTICIPANTS__ACTIVITY_PARTICIPANTS_USER_ID_FKEY;
    public static final ForeignKey<GoalsRecord, ProjectsRecord> GOALS__GOALS_PROJECT_ID_FKEY = ForeignKeys0.GOALS__GOALS_PROJECT_ID_FKEY;
    public static final ForeignKey<ProjectSubscribersRecord, ProjectsRecord> PROJECT_SUBSCRIBERS__PROJECT_SUBSCRIBERS_PROJECT_ID_FKEY = ForeignKeys0.PROJECT_SUBSCRIBERS__PROJECT_SUBSCRIBERS_PROJECT_ID_FKEY;
    public static final ForeignKey<ProjectSubscribersRecord, UsersRecord> PROJECT_SUBSCRIBERS__PROJECT_SUBSCRIBERS_USER_ID_FKEY = ForeignKeys0.PROJECT_SUBSCRIBERS__PROJECT_SUBSCRIBERS_USER_ID_FKEY;
    public static final ForeignKey<ProjectsRecord, UsersRecord> PROJECTS__PROJECTS_OWNER_ID_FKEY = ForeignKeys0.PROJECTS__PROJECTS_OWNER_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ActivitiesRecord, Integer> IDENTITY_ACTIVITIES = Internal.createIdentity(Activities.ACTIVITIES, Activities.ACTIVITIES.ID);
        public static Identity<GoalsRecord, Integer> IDENTITY_GOALS = Internal.createIdentity(Goals.GOALS, Goals.GOALS.ID);
        public static Identity<ProjectsRecord, Integer> IDENTITY_PROJECTS = Internal.createIdentity(Projects.PROJECTS, Projects.PROJECTS.ID);
        public static Identity<UsersRecord, Integer> IDENTITY_USERS = Internal.createIdentity(Users.USERS, Users.USERS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ActivitiesRecord> ACTIVITIES_PKEY = Internal.createUniqueKey(Activities.ACTIVITIES, "activities_pkey", new TableField[] { Activities.ACTIVITIES.ID }, true);
        public static final UniqueKey<ActivitiesRecord> ACTIVITIES_NAME_KEY = Internal.createUniqueKey(Activities.ACTIVITIES, "activities_name_key", new TableField[] { Activities.ACTIVITIES.NAME }, true);
        public static final UniqueKey<ActivityParticipantsRecord> ACTIVITY_PARTICIPANTS_USER_ID_ACTIVITY_ID_KEY = Internal.createUniqueKey(ActivityParticipants.ACTIVITY_PARTICIPANTS, "activity_participants_user_id_activity_id_key", new TableField[] { ActivityParticipants.ACTIVITY_PARTICIPANTS.USER_ID, ActivityParticipants.ACTIVITY_PARTICIPANTS.ACTIVITY_ID }, true);
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static final UniqueKey<GoalsRecord> GOALS_PKEY = Internal.createUniqueKey(Goals.GOALS, "goals_pkey", new TableField[] { Goals.GOALS.ID }, true);
        public static final UniqueKey<ProjectSubscribersRecord> PROJECT_SUBSCRIBERS_USER_ID_PROJECT_ID_KEY = Internal.createUniqueKey(ProjectSubscribers.PROJECT_SUBSCRIBERS, "project_subscribers_user_id_project_id_key", new TableField[] { ProjectSubscribers.PROJECT_SUBSCRIBERS.USER_ID, ProjectSubscribers.PROJECT_SUBSCRIBERS.PROJECT_ID }, true);
        public static final UniqueKey<ProjectsRecord> PROJECTS_PKEY = Internal.createUniqueKey(Projects.PROJECTS, "projects_pkey", new TableField[] { Projects.PROJECTS.ID }, true);
        public static final UniqueKey<ProjectsRecord> PROJECTS_NAME_KEY = Internal.createUniqueKey(Projects.PROJECTS, "projects_name_key", new TableField[] { Projects.PROJECTS.NAME }, true);
        public static final UniqueKey<UsersRecord> USERS_PKEY = Internal.createUniqueKey(Users.USERS, "users_pkey", new TableField[] { Users.USERS.ID }, true);
        public static final UniqueKey<UsersRecord> USERS_NAME_KEY = Internal.createUniqueKey(Users.USERS, "users_name_key", new TableField[] { Users.USERS.NAME }, true);
        public static final UniqueKey<UsersRecord> USERS_TG_ID_KEY = Internal.createUniqueKey(Users.USERS, "users_tg_id_key", new TableField[] { Users.USERS.TG_ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<ActivitiesRecord, ProjectsRecord> ACTIVITIES__ACTIVITIES_PROJECT_ID_FKEY = Internal.createForeignKey(Keys.PROJECTS_PKEY, Activities.ACTIVITIES, "activities_project_id_fkey", new TableField[] { Activities.ACTIVITIES.PROJECT_ID }, true);
        public static final ForeignKey<ActivityParticipantsRecord, ActivitiesRecord> ACTIVITY_PARTICIPANTS__ACTIVITY_PARTICIPANTS_ACTIVITY_ID_FKEY = Internal.createForeignKey(Keys.ACTIVITIES_PKEY, ActivityParticipants.ACTIVITY_PARTICIPANTS, "activity_participants_activity_id_fkey", new TableField[] { ActivityParticipants.ACTIVITY_PARTICIPANTS.ACTIVITY_ID }, true);
        public static final ForeignKey<ActivityParticipantsRecord, UsersRecord> ACTIVITY_PARTICIPANTS__ACTIVITY_PARTICIPANTS_USER_ID_FKEY = Internal.createForeignKey(Keys.USERS_PKEY, ActivityParticipants.ACTIVITY_PARTICIPANTS, "activity_participants_user_id_fkey", new TableField[] { ActivityParticipants.ACTIVITY_PARTICIPANTS.USER_ID }, true);
        public static final ForeignKey<GoalsRecord, ProjectsRecord> GOALS__GOALS_PROJECT_ID_FKEY = Internal.createForeignKey(Keys.PROJECTS_PKEY, Goals.GOALS, "goals_project_id_fkey", new TableField[] { Goals.GOALS.PROJECT_ID }, true);
        public static final ForeignKey<ProjectSubscribersRecord, ProjectsRecord> PROJECT_SUBSCRIBERS__PROJECT_SUBSCRIBERS_PROJECT_ID_FKEY = Internal.createForeignKey(Keys.PROJECTS_PKEY, ProjectSubscribers.PROJECT_SUBSCRIBERS, "project_subscribers_project_id_fkey", new TableField[] { ProjectSubscribers.PROJECT_SUBSCRIBERS.PROJECT_ID }, true);
        public static final ForeignKey<ProjectSubscribersRecord, UsersRecord> PROJECT_SUBSCRIBERS__PROJECT_SUBSCRIBERS_USER_ID_FKEY = Internal.createForeignKey(Keys.USERS_PKEY, ProjectSubscribers.PROJECT_SUBSCRIBERS, "project_subscribers_user_id_fkey", new TableField[] { ProjectSubscribers.PROJECT_SUBSCRIBERS.USER_ID }, true);
        public static final ForeignKey<ProjectsRecord, UsersRecord> PROJECTS__PROJECTS_OWNER_ID_FKEY = Internal.createForeignKey(Keys.USERS_PKEY, Projects.PROJECTS, "projects_owner_id_fkey", new TableField[] { Projects.PROJECTS.OWNER_ID }, true);
    }
}
