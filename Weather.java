class Weather {
    int weatherId;
    Climate climate;

    Weather() {}

    Weather(int weatherId, Climate climate) {
        System.out.println("Constructor is started");
        this.weatherId = weatherId;
        this.climate = climate;
        System.out.println("Constructor is ended");
    }

    public boolean addClimate(Climate climate) {
        boolean isClimateSaved = false;
        System.out.println("Add Climate Method started:");
        this.climate = climate;
        isClimateSaved = true;
        System.out.println("Add Climate Method ended:");
        return isClimateSaved;
    }

    public void getClimate() {
        System.out.println("Climate info:");
        System.out.println("Temperature: " + climate.temperature);
        System.out.println("Humidity: " + climate.humidity);
        System.out.println("Wind Speed: " + climate.windSpeed);
        System.out.println("Condition: " + climate.condition);
        System.out.println("Season: " + climate.season);
        System.out.println("Rainfall: " + climate.rainfall);
    }
}