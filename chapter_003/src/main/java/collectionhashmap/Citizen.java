package collectionhashmap;
import java.util.Objects;
//Представим ситуацию, что мы разрабатываем систему для паспортного стола.
//К нам приходят люди и просят выдать им паспорт. Нам нужно занести всех пользователей в систему и выдать им уникальный номер.
//В дальнейшем нам бы хотелось быстро находить информацию о пользователе по номеру паспорта.
//По описанию задачи у нас появляется ассоциация - это номер паспорта, который ассоциирован с информацией о пользователе.
//Модуль данных - гражданин
    public class Citizen {
        private String passport;
        private String username;

        public Citizen(String passport, String username) {
            this.passport = passport;
            this.username = username;
        }

        public String getPassport() {
            return passport;
        }

        public String getUsername() {
            return username;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Citizen citizen = (Citizen) o;
            return Objects.equals(passport, citizen.passport);
        }

        @Override
        public int hashCode() {
            return Objects.hash(passport);
        }
    }

