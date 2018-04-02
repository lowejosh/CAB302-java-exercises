package coll.EnrollmentManager;

import java.util.*;

public class EnrollmentManager {
	
	private static HashMap<String, Set<String>> enrollments = new HashMap<String, Set<String>>();

	/**
	 * Enrolls a student into a unit.
	 *
	 * @param unit
	 * @param student
	 */
	public static void enroll(String unit, String student) {
		Set<String> set;
		if (enrollments.containsKey(unit)) {
			set = enrollments.get(unit);
		} else {
			set = new HashSet<>();
		}
		set.add(student);
		enrollments.put(unit, set);
	}

	/**
	 * Gets the HashMap containing the current enrollments.
	 * 
	 * @return
	 */
	public static HashMap<String, Set<String>> getEnrollments() {
		return enrollments;
	}

	/**
	 * Removes all enrollments form the HashMap.
	 */
	public static void wipeEnrollments() {
		enrollments.clear();
	}

	/**
	 * Withdraws a student from a unit.
	 * 
	 * @param unit
	 * @param student
	 */
	public static void withdrawEnrollment(String unit, String student) {
		Set<String> set = enrollments.get(unit);
		set.remove(student);
		enrollments.put(unit, set);
	}

	/**
	 * Withdraws a student from all units they are enrolled in.
	 * 
	 * @param student
	 */
	public static void withdrawStudent(String student) {
       for (String unit : enrollments.keySet()) {
           if (enrollments.get(unit).contains(student)){
               Set<String> set = enrollments.get(unit);
               set.remove(student); 
               enrollments.put(unit, set);
           }
       }
	}

	/**
	 * Gets a list of all students of a particular discipline. E.g. If discipline is
	 * "ABC" then return a collection of all students enrolled in units that start
	 * with "ABC", so ABC301, ABC299, ABC741 etc. This method is non-trivial so it
	 * would help to first implement the helper method matchesDiscipline (below).
	 * 
	 * @param discipline
	 * @return
	 */
	public static Set<String> getStudents(String discipline) {
		Set<String> set = new HashSet<>();
		for (String unit : enrollments.keySet()) {
			if (unit.startsWith(discipline)) {
				set.addAll(enrollments.get(unit));
			}
		}
		return set;
	}
}