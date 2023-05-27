package Class_Names;

public class College {
	
	String College_name;
	Integer College_phonenumber;
	String College_address;
	int College_courses_total;
	int College_total_strength;
	int College_teaching_staff;
	String College_gmail;
	int College_total_rooms;
	int College_reating;

	@Override
	public String toString() {
		return "College [College_name=" + College_name + ", College_phonenumber=" + College_phonenumber
				+ ", College_address=" + College_address + ", College_courses_total=" + College_courses_total
				+ ", College_total_strength=" + College_total_strength + ", College_teaching_staff="
				+ College_teaching_staff + ", College_gmail=" + College_gmail + ", College_total_rooms="
				+ College_total_rooms + ", College_reating=" + College_reating + "]";
	}

	public String getCollege_name() {
		return College_name;
	}

	public void setCollege_name(String college_name) {
		College_name = college_name;
	}

	public Integer getCollege_phonenumber() {
		return College_phonenumber;
	}

	public void setCollege_phonenumber(Integer college_phonenumber) {
		College_phonenumber = college_phonenumber;
	}

	public String getCollege_address() {
		return College_address;
	}

	public void setCollege_address(String college_address) {
		College_address = college_address;
	}

	public int getCollege_courses_total() {
		return College_courses_total;
	}

	public void setCollege_courses_total(int college_courses_total) {
		College_courses_total = college_courses_total;
	}

	public int getCollege_total_strength() {
		return College_total_strength;
	}

	public void setCollege_total_strength(int college_total_strength) {
		College_total_strength = college_total_strength;
	}

	public int getCollege_teaching_staff() {
		return College_teaching_staff;
	}

	public void setCollege_teaching_staff(int college_teaching_staff) {
		College_teaching_staff = college_teaching_staff;
	}

	public String getCollege_gmail() {
		return College_gmail;
	}

	public void setCollege_gmail(String college_gmail) {
		College_gmail = college_gmail;
	}

	public int getCollege_total_rooms() {
		return College_total_rooms;
	}

	public void setCollege_total_rooms(int college_total_rooms) {
		College_total_rooms = college_total_rooms;
	}

	public int getCollege_reating() {
		return College_reating;
	}

	public void setCollege_reating(int college_reating) {
		College_reating = college_reating;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public College(String college_name, Integer college_phonenumber, String college_address, int college_courses_total,
			int college_total_strength, int college_teaching_staff, String college_gmail, int college_total_rooms,
			int college_reating) {
		super();
		College_name = college_name;
		College_phonenumber = college_phonenumber;
		College_address = college_address;
		College_courses_total = college_courses_total;
		College_total_strength = college_total_strength;
		College_teaching_staff = college_teaching_staff;
		College_gmail = college_gmail;
		College_total_rooms = college_total_rooms;
		College_reating = college_reating;
	}

}
