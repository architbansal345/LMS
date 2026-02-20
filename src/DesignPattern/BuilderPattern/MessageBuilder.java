package DesignPattern.BuilderPattern;

public class MessageBuilder {
    private  String content;
    private String sender;
    private String reciever;
    private boolean isDelivered;
    private long timestamp;
    private MessageBuilder(Builder builder){
        this.content = builder.content;
        this.sender = builder.sender;
        this.reciever = builder.reciever;
        this.isDelivered = builder.isDelivered;
        this.timestamp = builder.timestamp;
    }
    public static Builder create(){
        return new Builder();
    }

    public String getContent() {
        return content;
    }


    public static class  Builder{
        private  String content;
        private String sender;
        private String reciever;
        private boolean isDelivered;
        private long timestamp;
        public Builder setContent(String content){
            this.content = content;
            return this;
        }
        public Builder setSender(String sender){
            this.sender = sender;
            return this;
        }
        public Builder setReciever(String reciever){
            this.reciever = reciever;
            return this;
        }
        public Builder setIsDelivered(boolean isDelivered){
            this.isDelivered = isDelivered;
            return this;
        }
        public Builder setTimestamp(long timestamp){
            this.timestamp = timestamp;
            return this;
        }
        public MessageBuilder build(){
            return new MessageBuilder(this);
        }
    }
}
