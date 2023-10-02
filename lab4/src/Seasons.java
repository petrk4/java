public class Seasons {
    enum Season {
        Spring(10),
        Summer(25),
        Autumn(15),
        Winter(-10);

        private int temperature;

        public int getTemperature() {
            return temperature;
        }

        public String getDescription() {
            switch (this) {
                case Summer:
                    return "Теплое время года";

                default:
                    return "Холодное время года";
            }
        }

        Season (int temperature) {
            this.temperature = temperature;
        }

    }

    public static void main(String[] args) {
        Season season = Season.Summer;

        System.out.println("Любимое время года: " + season);
        System.out.println("Средняя температура: " + season.getTemperature());
        System.out.println(season + " - " + season.getDescription());

        for (Season i : Season.values()) {
            System.out.println(i + ": " + i.temperature + " градусов, " + i.getDescription());
        }
    }
}