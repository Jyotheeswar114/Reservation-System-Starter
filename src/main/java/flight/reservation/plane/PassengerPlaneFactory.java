package flight.reservation.plane;

public class PassengerPlaneFactory {

        public PassengerPlane getPlaneType(String model) {

            if (model == null) {
                return null;
            }
            if (model.equalsIgnoreCase("A380")) {
                return new A380Plane();

            } else if (model.equalsIgnoreCase("A350")) {
                return new A350Plane();

            } else if (model.equalsIgnoreCase("Embraer 190")) {
                return new Embraer190Plane();
            } else if (model.equalsIgnoreCase("Antonov AN2")) {
                return new AntonovAN2Plane();
            }

            return null;
        }


}
