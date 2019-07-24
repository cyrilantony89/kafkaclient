package kafkaclient;
public interface IKafkaConstants {
    public static String KAFKA_BROKERS = "kafka.tea2.tivo.com:9092";
    public static Integer MESSAGE_COUNT=1000;
    public static String CLIENT_ID="client1";
    public static String TOPIC_NAME="tea2.udf-test.udf.danube-pgd";
    public static String GROUP_ID_CONFIG="consumerGroup1";
    public static Integer MAX_NO_MESSAGE_FOUND_COUNT=100;
    public static String OFFSET_RESET_LATEST="latest";
    public static String OFFSET_RESET_EARLIER="earliest";
    public static String OFFSET_RESET_NUMBER="61456713";
    public static Integer MAX_POLL_RECORDS=1;
}