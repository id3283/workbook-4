import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employee = new Employee();

    @org.junit.jupiter.api.Test
    void punchOut() {
        // Arrange
        employee.punchIn(9);

        // Act
        employee.punchOut(17);

        // Assert
        double actual = employee.getHoursWorked();

        assertEquals(8, actual);
    }

    @Test
    void testIfPunchOutAfterMidnightWorks() {
        employee.punchIn(9);
        employee.punchOut(2);

        double actual = employee.getHoursWorked();

        double expected = 17;

        assertEquals(expected, actual);
    }
}