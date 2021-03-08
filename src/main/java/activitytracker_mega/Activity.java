package activitytracker_mega;

import java.time.LocalDateTime;

    public class Activity {

        private int id;
        private java.time.LocalDateTime startTime;
        private String desc;
        private ActivityType type;


        public LocalDateTime getStartTime() {
            return startTime;
        }

        public String getDesc() {
            return desc;
        }

        public ActivityType getType() {
            return type;
        }

   /* public Activity(int id, LocalDateTime startTime, String desc, ActivityType type) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    */

        @Override
        public String toString() {
            return "startTime= " + startTime + ", desc= " + desc + ", type= " + type;
        }

        public Activity(LocalDateTime startTime, String desc, ActivityType type) {
            this.startTime = startTime;
            this.desc = desc;
            this.type = type;
        }
    }
