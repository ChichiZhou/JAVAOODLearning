package ObserverProject;

public interface Observer {
    /**
     * 这个是真正需要观察的东西
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void update(float temperature, float humidity, float pressure);
}
