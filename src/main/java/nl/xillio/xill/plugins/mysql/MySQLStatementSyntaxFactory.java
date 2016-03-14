package nl.xillio.xill.plugins.mysql;

import nl.xillio.xill.plugins.jdbc.services.StatementSyntaxFactoryImpl;

/**
 * This class overrides the default select one construction for mysql.
 *
 * @author Xavier Pardonnet
 */
class MySQLStatementSyntaxFactory extends StatementSyntaxFactoryImpl {
    @Override
    protected String selectOne(String escapedTableName, String constraints) {
        return String.format("SELECT * FROM %s WHERE %s LIMIT 1", escapedTableName, constraints);
    }

    @Override
    protected String selectOne(String escapedTableName) {
        return String.format("SELECT * FROM %s LIMIT 1", escapedTableName);
    }

    @Override
    protected String escapeIdentifier(String unescaped) {
        return String.format("`%s`", unescaped);
    }
}
