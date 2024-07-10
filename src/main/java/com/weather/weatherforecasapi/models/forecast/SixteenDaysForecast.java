package com.weather.weatherforecasapi.models.forecast;

import java.util.Collection;


public class SixteenDaysForecast {
    private City city;
    private String cod;
    private Number message;
    private Integer cnt;
    private Collection<List> list;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Number getMessage() {
        return message;
    }

    public void setMessage(Number message) {
        this.message = message;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public Collection<List> getList() {
        return list;
    }

    public void setList(Collection<List> list) {
        this.list = list;
    }

    public static class City {
        private Integer id;
        private String name;
        private Coord coord;
        private String country;
        private Integer population;
        private Integer timezone;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Coord getCoord() {
            return coord;
        }

        public void setCoord(Coord coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Integer getPopulation() {
            return population;
        }

        public void setPopulation(Integer population) {
            this.population = population;
        }

        public Integer getTimezone() {
            return timezone;
        }

        public void setTimezone(Integer timezone) {
            this.timezone = timezone;
        }

        public static class Coord {
            private Number lon;
            private Number lat;

            public Number getLon() {
                return lon;
            }

            public void setLon(Number lon) {
                this.lon = lon;
            }

            public Number getLat() {
                return lat;
            }

            public void setLat(Number lat) {
                this.lat = lat;
            }
        }
    }

    public static class List {
        private Integer dt;
        private Integer sunrise;
        private Integer sunset;
        private Temp temp;
        private FeelsLike feelsLike;
        private Integer pressure;
        private Integer humidity;
        private Collection<Weather> weather;
        private Number speed;
        private Integer deg;
        private Number gust;
        private Integer clouds;
        private Number pop;
        private Number rain;

        public Integer getDt() {
            return dt;
        }

        public void setDt(Integer dt) {
            this.dt = dt;
        }

        public Integer getSunrise() {
            return sunrise;
        }

        public void setSunrise(Integer sunrise) {
            this.sunrise = sunrise;
        }

        public Integer getSunset() {
            return sunset;
        }

        public void setSunset(Integer sunset) {
            this.sunset = sunset;
        }

        public Temp getTemp() {
            return temp;
        }

        public void setTemp(Temp temp) {
            this.temp = temp;
        }

        public FeelsLike getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(FeelsLike feelsLike) {
            this.feelsLike = feelsLike;
        }

        public Integer getPressure() {
            return pressure;
        }

        public void setPressure(Integer pressure) {
            this.pressure = pressure;
        }

        public Integer getHumidity() {
            return humidity;
        }

        public void setHumidity(Integer humidity) {
            this.humidity = humidity;
        }

        public Collection<Weather> getWeather() {
            return weather;
        }

        public void setWeather(Collection<Weather> weather) {
            this.weather = weather;
        }

        public Number getSpeed() {
            return speed;
        }

        public void setSpeed(Number speed) {
            this.speed = speed;
        }

        public Integer getDeg() {
            return deg;
        }

        public void setDeg(Integer deg) {
            this.deg = deg;
        }

        public Number getGust() {
            return gust;
        }

        public void setGust(Number gust) {
            this.gust = gust;
        }

        public Integer getClouds() {
            return clouds;
        }

        public void setClouds(Integer clouds) {
            this.clouds = clouds;
        }

        public Number getPop() {
            return pop;
        }

        public void setPop(Number pop) {
            this.pop = pop;
        }

        public Number getRain() {
            return rain;
        }

        public void setRain(Number rain) {
            this.rain = rain;
        }

        public static class Temp {
            private Number day;
            private Number min;
            private Number max;
            private Number night;
            private Number eve;
            private Number morn;

            public Number getDay() {
                return day;
            }

            public void setDay(Number day) {
                this.day = day;
            }

            public Number getMin() {
                return min;
            }

            public void setMin(Number min) {
                this.min = min;
            }

            public Number getMax() {
                return max;
            }

            public void setMax(Number max) {
                this.max = max;
            }

            public Number getNight() {
                return night;
            }

            public void setNight(Number night) {
                this.night = night;
            }

            public Number getEve() {
                return eve;
            }

            public void setEve(Number eve) {
                this.eve = eve;
            }

            public Number getMorn() {
                return morn;
            }

            public void setMorn(Number morn) {
                this.morn = morn;
            }
        }

        public static class FeelsLike {
            private Number day;
            private Number night;
            private Number eve;
            private Number morn;

            public Number getDay() {
                return day;
            }

            public void setDay(Number day) {
                this.day = day;
            }

            public Number getNight() {
                return night;
            }

            public void setNight(Number night) {
                this.night = night;
            }

            public Number getEve() {
                return eve;
            }

            public void setEve(Number eve) {
                this.eve = eve;
            }

            public Number getMorn() {
                return morn;
            }

            public void setMorn(Number morn) {
                this.morn = morn;
            }
        }

        public static class Weather {
            private Integer id;
            private String main;
            private String description;
            private String icon;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}