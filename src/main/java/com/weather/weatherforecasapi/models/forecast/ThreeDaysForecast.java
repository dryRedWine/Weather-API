package com.weather.weatherforecasapi.models.forecast;

import java.util.Collection;

public class ThreeDaysForecast {
    private String cod;
    private Integer message;
    private Integer cnt;
    private Collection<List> list;
    private City city;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Integer getMessage() {
        return message;
    }

    public void setMessage(Integer message) {
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public static class List {
        private Integer dt;
        private Main main;
        private Collection<Weather> weather;
        private Clouds clouds;
        private Wind wind;
        private Integer visibility;
        private Number pop;
        private Rain rain;
        private Sys sys;
        private String dtTxt;

        public Integer getDt() {
            return dt;
        }

        public void setDt(Integer dt) {
            this.dt = dt;
        }

        public Main getMain() {
            return main;
        }

        public void setMain(Main main) {
            this.main = main;
        }

        public Collection<Weather> getWeather() {
            return weather;
        }

        public void setWeather(Collection<Weather> weather) {
            this.weather = weather;
        }

        public Clouds getClouds() {
            return clouds;
        }

        public void setClouds(Clouds clouds) {
            this.clouds = clouds;
        }

        public Wind getWind() {
            return wind;
        }

        public void setWind(Wind wind) {
            this.wind = wind;
        }

        public Integer getVisibility() {
            return visibility;
        }

        public void setVisibility(Integer visibility) {
            this.visibility = visibility;
        }

        public Number getPop() {
            return pop;
        }

        public void setPop(Number pop) {
            this.pop = pop;
        }

        public Rain getRain() {
            return rain;
        }

        public void setRain(Rain rain) {
            this.rain = rain;
        }

        public Sys getSys() {
            return sys;
        }

        public void setSys(Sys sys) {
            this.sys = sys;
        }

        public String getDtTxt() {
            return dtTxt;
        }

        public void setDtTxt(String dtTxt) {
            this.dtTxt = dtTxt;
        }

        public static class Main {
            private Number temp;
            private Number feelsLike;
            private Number tempMin;
            private Number tempMax;
            private Integer pressure;
            private Integer seaLevel;
            private Integer grndLevel;
            private Integer humidity;
            private Number tempKf;

            public Number getTemp() {
                return temp;
            }

            public void setTemp(Number temp) {
                this.temp = temp;
            }

            public Number getFeelsLike() {
                return feelsLike;
            }

            public void setFeelsLike(Number feelsLike) {
                this.feelsLike = feelsLike;
            }

            public Number getTempMin() {
                return tempMin;
            }

            public void setTempMin(Number tempMin) {
                this.tempMin = tempMin;
            }

            public Number getTempMax() {
                return tempMax;
            }

            public void setTempMax(Number tempMax) {
                this.tempMax = tempMax;
            }

            public Integer getPressure() {
                return pressure;
            }

            public void setPressure(Integer pressure) {
                this.pressure = pressure;
            }

            public Integer getSeaLevel() {
                return seaLevel;
            }

            public void setSeaLevel(Integer seaLevel) {
                this.seaLevel = seaLevel;
            }

            public Integer getGrndLevel() {
                return grndLevel;
            }

            public void setGrndLevel(Integer grndLevel) {
                this.grndLevel = grndLevel;
            }

            public Integer getHumidity() {
                return humidity;
            }

            public void setHumidity(Integer humidity) {
                this.humidity = humidity;
            }

            public Number getTempKf() {
                return tempKf;
            }

            public void setTempKf(Number tempKf) {
                this.tempKf = tempKf;
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

        public static class Clouds {
            private Integer all;

            public Integer getAll() {
                return all;
            }

            public void setAll(Integer all) {
                this.all = all;
            }
        }

        public static class Wind {
            private Number speed;
            private Integer deg;
            private Number gust;

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
        }

        public static class Rain {
            private Number h;

            public Number getH() {
                return h;
            }

            public void setH(Number h) {
                this.h = h;
            }
        }

        public static class Sys {
            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }
    }

    public static class City {
        private Integer id;
        private String name;
        private Coord coord;
        private String country;
        private Integer population;
        private Integer timezone;
        private Integer sunrise;
        private Integer sunset;

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

        public static class Coord {
            private Number lat;
            private Number lon;

            public Number getLat() {
                return lat;
            }

            public void setLat(Number lat) {
                this.lat = lat;
            }

            public Number getLon() {
                return lon;
            }

            public void setLon(Number lon) {
                this.lon = lon;
            }
        }
    }
}