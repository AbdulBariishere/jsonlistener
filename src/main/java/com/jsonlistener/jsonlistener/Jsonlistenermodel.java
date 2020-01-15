package com.jsonlistener.jsonlistener;

public class Jsonlistenermodel {
    public String GPSLatitude;
    public String InforCode;
    public String GPSLatitudeDirect;
    public String GPSSPEED;
    public String GPSDateTime;
    public String VehicleNo;
    public String IMEINo;
    public String GPSValidity;
    public String Satellite;
    public String GPSLongitude;
    public String IgnitionValue;
    public String DeviceBatteryVolt;
    public String Angle;
    public String APIConsumeLogTime;
    public String GPSLongitudeDirec;
    private Jsonlistenermodel jsonlistenermodel;

public Jsonlistenermodel(){

}

    public Jsonlistenermodel(String GPSLatitude, String inforCode, String GPSLatitudeDirect, String GPSSPEED, String GPSDateTime, String vehicleNo, String IMEINo, String GPSValidity, String satellite, String GPSLongitude, String ignitionValue, String deviceBatteryVolt, String angle, String APIConsumeLogTime, String GPSLongitudeDirec) {
        this.GPSLatitude = GPSLatitude;
        InforCode = inforCode;
        this.GPSLatitudeDirect = GPSLatitudeDirect;
        this.GPSSPEED = GPSSPEED;
        this.GPSDateTime = GPSDateTime;
        VehicleNo = vehicleNo;
        this.IMEINo = IMEINo;
        this.GPSValidity = GPSValidity;
        Satellite = satellite;
        this.GPSLongitude = GPSLongitude;
        IgnitionValue = ignitionValue;
        DeviceBatteryVolt = deviceBatteryVolt;
        Angle = angle;
        this.APIConsumeLogTime = APIConsumeLogTime;
        this.GPSLongitudeDirec = GPSLongitudeDirec;
    }

    public String getGPSLatitude() {
        return GPSLatitude;
    }

    public void setGPSLatitude(String GPSLatitude) {
        this.GPSLatitude = GPSLatitude;
    }

    public String getInforCode() {
        return InforCode;
    }

    public void setInforCode(String inforCode) {
        InforCode = inforCode;
    }

    public String getGPSLatitudeDirect() {
        return GPSLatitudeDirect;
    }

    public void setGPSLatitudeDirect(String GPSLatitudeDirect) {
        this.GPSLatitudeDirect = GPSLatitudeDirect;
    }

    public String getGPSSPEED() {
        return GPSSPEED;
    }

    public void setGPSSPEED(String GPSSPEED) {
        this.GPSSPEED = GPSSPEED;
    }

    public String getGPSDateTime() {
        return GPSDateTime;
    }

    public void setGPSDateTime(String GPSDateTime) {
        this.GPSDateTime = GPSDateTime;
    }

    public String getVehicleNo() {
        return VehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        VehicleNo = vehicleNo;
    }

    public String getIMEINo() {
        return IMEINo;
    }

    public void setIMEINo(String IMEINo) {
        this.IMEINo = IMEINo;
    }

    public String getGPSValidity() {
        return GPSValidity;
    }

    public void setGPSValidity(String GPSValidity) {
        this.GPSValidity = GPSValidity;
    }

    public String getSatellite() {
        return Satellite;
    }

    public void setSatellite(String satellite) {
        Satellite = satellite;
    }

    public String getGPSLongitude() {
        return GPSLongitude;
    }

    public void setGPSLongitude(String GPSLongitude) {
        this.GPSLongitude = GPSLongitude;
    }

    public String getIgnitionValue() {
        return IgnitionValue;
    }

    public void setIgnitionValue(String ignitionValue) {
        IgnitionValue = ignitionValue;
    }

    public String getDeviceBatteryVolt() {
        return DeviceBatteryVolt;
    }

    public void setDeviceBatteryVolt(String deviceBatteryVolt) {
        DeviceBatteryVolt = deviceBatteryVolt;
    }

    public String getAngle() {
        return Angle;
    }

    public void setAngle(String angle) {
        Angle = angle;
    }

    public String getAPIConsumeLogTime() {
        return APIConsumeLogTime;
    }

    public void setAPIConsumeLogTime(String APIConsumeLogTime) {
        this.APIConsumeLogTime = APIConsumeLogTime;
    }

    public String getGPSLongitudeDirec() {
        return GPSLongitudeDirec;
    }

    public void setGPSLongitudeDirec(String GPSLongitudeDirec) {
        this.GPSLongitudeDirec = GPSLongitudeDirec;
    }
}
