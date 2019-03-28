/**
 * created by:Sangharsha Ranpise.
 * Date :23/03/2019.
 * Purpose :
 */
package Com.BridgeIt.ObjectOrientedPrograms.CliniqueManagement;
public class Appointment 
{
    
	private String doctorName;
	private int doctorId;
	private String date;
	private String time;
	private String patientName;
	private int patientId;
	private String Availibility;
	private String patientPhone;

	public Appointment() 
	{
		
	}

	public Appointment(String doctorName,int date,int time, int doctorId, String patientName, int patientId, String patientPhone,
			String Availibility) 
	{
		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.patientName = patientName;
		this.patientId = patientId;
		this.Availibility = Availibility;
		this.patientPhone = patientPhone;
	}

	public String getAvailibility() {
		return Availibility;
	}

	public void setAvailibility(String Availibility) {
		this.Availibility = Availibility;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientPhone() {
		return patientPhone;
	}

	public void setPatientPhone(String patientPhone) 
	{
		this.patientPhone = patientPhone;
	}

	@Override
	public String toString() 
	{
		return "Appointment [doctorName=" + doctorName + ", doctorId=" + doctorId + ", patientName=" + patientName
				+ ", patientId=" + patientId + ", Availibility=" + Availibility + ", patientPhone=" + patientPhone
				+ "]";
	}

}
