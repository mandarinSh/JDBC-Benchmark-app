import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Option;



public class Config {
    private String dbHost;
    private String dbPort;
    private String dbName;
    private String accessCredentialUsername;
    private String accessCredentialPassword;
    private String tableName;
    private String outputFileName;
    private int payloadSize;
    private int countInsertOperations;
    private int countInsertionThreads;

    private Options options;

    Config() {
        dbHost = "localhost";
        dbPort = "3306";
        dbName = "test";
        accessCredentialUsername = "root";
        accessCredentialPassword = "1";
        tableName = "table_1";
        outputFileName = "";
        payloadSize = 0;
        countInsertOperations = 2147483647;
        countInsertionThreads = 1;
    }

    public Options setOptions(String... args) throws ParseException {
        options = new Options();

        options.addOption(OptionBuilder.withArgName("host")
                                       .hasArg()
                                       .withDescription("Specify database's host."
                                        + " /'localhost/' by default.")
                                       .create("dbHost"));
        options.addOption(OptionBuilder.withArgName("port")
                                       .hasArg()
                                       .withDescription("Specify database's port."
                                        + " /'3306/' by default.")
                                       .create("dbPort"));
        options.addOption(OptionBuilder.withArgName("name")
                                       .hasArg()
                                       .withDescription("Specify database's name.")
                                       .create("dbName"));
        options.addOption(OptionBuilder.withArgName("username")
                                       .hasArg()
                                       .withDescription("Specify database's"
                                        + " username for connection."
                                        +  "/'root/' by default.")
                                       .create("accessCredentialUsername"));
        options.addOption(OptionBuilder.withArgName("password")
                                       .hasArg()
                                       .withDescription("Specify database's "
                                        + "password for connection."
                                        + " /'1/' by default.")
                                       .create("accessCredentialPassword"));
        options.addOption(OptionBuilder.withArgName("table")
                                       .hasArg()
                                       .withDescription("Specify table name "
                                        + "for insert operations.")
                                       .create("tableName"));
        options.addOption(OptionBuilder.withArgName("fileName")
                                       .hasArg()
                                       .withDescription("Specify file name for output."
                                        + "No output file by default.")
                                       .create("outputFileName"));
        options.addOption(OptionBuilder.withArgName("size")
                                       .hasArg()
                                       .withDescription("Specify payload size in bytes.")
                                       .create("payloadSize"));
        options.addOption(OptionBuilder.withArgName("count")
                                       .hasArg()
                                       .withDescription("Specify count of insert operations."
                                        + "Infinity by default.")
                                       .create("countInsertOperations"));
        options.addOption(OptionBuilder.withArgName("count")
                                       .hasArg()
                                       .withDescription("Specify count of threads."
                                        + " /'1/' by default.")
                                       .create("countInsertionThreads"));


        CommandLineParser parser = new DefaultParser();
        CommandLine cmdLine = parser.parse(options, args);

        return options;
    }

    public void setdbHost(CommandLine cmdLine) {
        String dbHostOption = cmdLine.getOptionValue("dbHost");

        if (dbHostOption != null) {
            dbHost = dbHostOption;
        }
    }

    public void setdbPort(CommandLine cmdLine) {
        String dbPortOption = cmdLine.getOptionValue("dbPort");

        if (dbPortOption != null) {
            dbPort = dbPortOption;
        }
    }

    public void setdbName(CommandLine cmdLine) {
        String dbNameOption = cmdLine.getOptionValue("dbName");

        if (dbNameOption != null) {
            dbName = dbNameOption;
        }
    }

    public void setAccessCredentialUsername(CommandLine cmdLine) {
        String accessCredentialUsernameOption = 
            cmdLine.getOptionValue("accessCredentialUsername");

        if (accessCredentialUsernameOption != null) {
            accessCredentialUsername = accessCredentialUsernameOption;
        }
    }

    public void setAccessCredentialPassword(CommandLine cmdLine) {
        String accessCredentialPasswordOption = 
            cmdLine.getOptionValue("accessCredentialPassword");

        if (accessCredentialPasswordOption != null) {
            accessCredentialPassword = accessCredentialPasswordOption;
        }
    }

    public void setOutputFileName(CommandLine cmdLine) {
        String outputFileNameOption = cmdLine.getOptionValue("outputFileName");

        if (outputFileNameOption != null) {
            outputFileName = outputFileNameOption;
        }
    }

    public void setPayloadSize(CommandLine cmdLine) {
        String payloadSizeOption = cmdLine.getOptionValue("payloadSize");

        if (payloadSizeOption != null) {
            payloadSize = Integer.parseInt(payloadSizeOption);
        }
    }

    public void setCountInsertOperations(CommandLine cmdLine) {
        String countInsertOperationsOption = cmdLine.getOptionValue("countInsertOperations");

        if (countInsertOperationsOption != null) {
            countInsertOperations = Integer.parseInt(countInsertOperationsOption);
        }
    }

    public void setCountInsertionThreads(CommandLine cmdLine) {
        String countInsertionThreadsOption = cmdLine.getOptionValue("countInsertionThreads");

        if (countInsertionThreadsOption != null) {
            countInsertionThreads = Integer.parseInt(countInsertionThreadsOption);
        }
    }

    public String getdbHost() {
        return dbHost;
    }

    public String getdbPort() {
        return dbPort;
    }

    public String getdbName() {
        return dbName;
    }

    public String getAccessCredentialUsername() {
        return accessCredentialUsername;
    }

    public String getAccessCredentialPassword() {
        return accessCredentialPassword;
    }

    public String getTableName() {
        return tableName;
    }

    public String getOutputFileName() {
        return outputFileName;
    }

    public int getPayloadSize() {
        return payloadSize;
    }

    public int getCountInsertOperations() {
        return countInsertOperations;
    }

    public int getCountInsertionThreads() {
        return countInsertionThreads;
    }

}