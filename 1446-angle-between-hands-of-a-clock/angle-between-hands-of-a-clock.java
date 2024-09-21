class Solution {
    public double angleClock(int hour, int minutes) {
        double hourAngle = (hour%12 + minutes / 60.0)*30.0; 
        double minAngle = minutes*6.0; //minute hour moves 6 degrees per minute
        double angle = Math.abs(hourAngle-minAngle);
        angle = Math.min(angle,360-angle);
        //if  greater than 180 subtract from 360
        return angle;
    }
}