public class EnumDemo3
{
    enum Transport
    {
        CAR( 65 ), TRUCK( 55 ), AIRPLANE( 600 ), TRAIN( 70 ), BOAT( 22 );

        private int speed; // typical speed of each transport

        // Constructor
        Transport( int s )
        {
            speed = s;
        }

        int getSpeed()
        {
            return speed;
        }
    }

    public static void main( String[] args )
    {
        Transport tp;

        // Display speed of an airplance.
        System.out
                .println( "Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed() + " miles per hours.\n" );

        System.out.println( "All Transport speeds: " );
        for( Transport t : Transport.values() )
        {
            System.out.println( t + " typical speed is " + t.getSpeed() + " miles per hour." );
        }
    }
}
