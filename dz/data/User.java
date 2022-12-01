package OOP_sem2.dz.data;

import OOP_sem2.dz.util.StudyGrupIterator;

public abstract class User extends StudyGrupIterator {
        private String name;
        private String birthday;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }


}
