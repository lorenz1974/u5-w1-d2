package menu.entity;

public enum TableState {

    OCCUPIED, FREE;

    public static TableState fromString(String state) {
        switch (state) {
            case "OCCUPIED":
                return OCCUPIED;
            case "FREE":
                return FREE;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        switch (this) {
            case OCCUPIED:
                return "OCCUPIED";
            case FREE:
                return "FREE";
            default:
                return null;
        }
    }
}
