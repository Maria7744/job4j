package parcing;

import java.util.Objects;

public abstract class AbstractAvto implements Avto{


        private String number;

        private String name;

        private int size;

    public AbstractAvto(String number, String name, int size) {
            this.number = number;
            this.name = name;
            this.size = size;
        }

        @Override
        public String name() {
            return this.name;
        }

        @Override
        public String number() {
            return this.number;
        }

        @Override
        public int size() {
            return this.size;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            AbstractAvto that = (AbstractAvto) o;
            return Objects.equals(number, that.number);
        }

        @Override
        public int hashCode() {
            return Objects.hash(number);
        }
    }


