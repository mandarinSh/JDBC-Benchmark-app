import org.apache.commons.cli.*;


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

    Options options = new Options();

}