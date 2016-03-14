package nl.xillio.xill.plugins.mysql;

import com.mysql.jdbc.Driver;
import nl.xillio.xill.plugins.jdbc.services.ConnectionStringFactory;

class MySQLConnectionFactory extends ConnectionStringFactory {

    @Override
    protected Class<? extends java.sql.Driver> driver() {
        return Driver.class;
    }
}
