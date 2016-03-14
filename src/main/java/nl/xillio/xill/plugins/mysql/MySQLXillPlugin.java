package nl.xillio.xill.plugins.mysql;

import nl.xillio.xill.plugins.jdbc.JDBCXillPlugin;
import nl.xillio.xill.plugins.jdbc.services.ConnectionFactory;
import nl.xillio.xill.plugins.jdbc.services.StatementSyntaxFactory;

/**
 * This class represents the configuration of the MySQL construct package.
 *
 * @author Xavier Pardonnet
 */
public class MySQLXillPlugin extends JDBCXillPlugin {

    @Override
    protected Class<? extends ConnectionFactory> connectionFactory() {
        return MySQLConnectionFactory.class;
    }

    @Override
    protected Class<? extends StatementSyntaxFactory> selectStatementFactory() {
        return MySQLStatementSyntaxFactory.class;
    }
}
