package com.pearson.Readers;

import com.pearson.Database.MySQL.MySQLTable;
import com.pearson.Database.SQL.Database;
import noNamespace.Rule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

/**
 * This is an abstract class for three types of substitution readers(sorted by type). SetToNull,
 * enablsing and disabling constraints are shared by different types of substitutions
 *
 * @author Ruslan Kiselev
 *         Date: 7/18/13
 *         Time: 9:22 AM
 *         Project Name: DataScrubber
 */
public abstract class SubstitutionReader implements Runnable {
    
    private static Logger logger = LoggerFactory.getLogger(SubstitutionReader.class.getName());
    Database database;
    Rule rule;
    MySQLTable mySQLTable;

    public SubstitutionReader(Rule rule, Database database) {
        this.rule = rule;
        this.database = database;

        mySQLTable = database.getTable(rule.getTarget());
    }

    public abstract void run();


    public void setToNull() throws SQLException {

        mySQLTable.setColumnToNull(rule.getSubstitute().getColumn());

    }

    protected void disableConstraints() throws SQLException {

        mySQLTable.getConnectionConfig().disableUniqueChecks();
        mySQLTable.getConnectionConfig().disableForeignKeyConstraints();

    }

}
