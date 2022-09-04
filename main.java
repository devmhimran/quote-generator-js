

public class Client{
    private final AbstractFactory_MessageQueue factory;
    public Client(AbstractFactory_MessageQueue factory){
        this.factory = factory;
    }
    public void sendMessage() {
        OutboundQueue out = factory. createProductA(); 
        out.sendMessage("Mello Abstract Factory!"); 
    }
    public String receiveMessage() {
        ReplyQueue in = factory.createProductB();
        return in.receiveMessage();
    }
        public interface AbstractFactory_MessageQueue {
            OutboundQueue createProductA();
            ReplyQueue createProductB();
        }
        public class ConcreteFactory_Azure implements AbstractFactory_MessageQueue {
            @Override public OutboundQueue createProductA() {
            return new AzuremessageQueue();
            }
}
public class ConcreteFactory_Msmq implements AbstractFactory_MessageQueue{
    @Override
    public OutboundQueue createProductA(){
        return new MsmqMessageQueue();
    }
}



public abstract class Creator {
    public void anOperator() {
        Product p = factoryMethod();
        p.whatever();
    }
    protected abstract Product factoryMethod();
}

public class ConcreteCreator extends Creator {
    @Override
    protected Product factoryMethod(){
        return new ConcreteProduct();
    }
}