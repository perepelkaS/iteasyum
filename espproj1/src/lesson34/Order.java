package lesson34;

public class Order {
    private int id;
    private int clientId;
    private String desc;
    private Client client;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", desc='" + desc + '\'' +
                ", client=" + client +
                '}';
    }

    public Order(int id, int clientId, String desc) {
        this.id = id;
        this.clientId = clientId;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
