package Fourteenth;

public class SecurityGuard extends Person implements OfficeSupportEntity{
    Computer c;
    Office o;
    public SecurityGuard(Long id, String name, Office o, Computer c) {
        super(id, name);
        this.o = o;
        this.c = c;
    }

        @Override
        public Computer getComputer() {
            return c;
        }

        @Override
        public void setComputer(Computer c) {
            this.c = c;
        }

        @Override
        public Office getOffice() {
            return o;
        }

        @Override
        public void setOffice(Office o) {
            this.o = o;
        }
}
