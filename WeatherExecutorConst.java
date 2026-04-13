class WeatherExecutorConst {
    public static void main(String[] args) {

        Climate climate = new Climate();
        climate.temperature = 28.5;
        climate.humidity = 65.0;
        climate.windSpeed = 12.5;
        climate.condition = "Sunny";
        climate.season = "Summer";
        climate.rainfall = 0.0;

        Weather weather = new Weather(801, climate);

        weather.getClimate();
    }
}