package class16;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class TableDemo extends JFrame {
	private JTable table;
	private TableModel tableModel;
	private List<Student> students;

	public TableDemo() {
		create();
		addTable();
		setSize(400, 400);
		setVisible(true);
		pack();
	}

	private void addTable() {
		setLayout(new FlowLayout());
		add(new JScrollPane(table));

	}

	private void create() {
		students = createAFewStudents();
		tableModel = new StudentTableModel(students);
		table = new JTable(tableModel);

	}

	private List<Student> createAFewStudents() {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Deepika", 100, 3.45f));
		students.add(new Student("Yating", 101, 3.65f));
		students.add(new Student("Jason", 102, 3.3f));
		students.add(new Student("Siva", 103, 3.44f));
		return students;
	}

	public static void main(String[] args) {
		new TableDemo();

	}

}

class Student {
	String name;
	int roll;
	float gpa;

	Student(String name, int roll, float gpa) {
		this.name = name;
		this.roll = roll;
		this.gpa = gpa;
	}
}

class StudentTableModel extends AbstractTableModel {

	private List<Student> students;

	public StudentTableModel(List<Student> students) {
		this.students = students;
	}

	@Override
	public int getRowCount() {
		return students.size();
	}

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 0) {
			return "Name";
		}
		if (columnIndex == 1) {
			return "Roll";
		}
		return "GPA";
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Student s = students.get(rowIndex);
		if (columnIndex == 0) {
			return s.name;
		}
		if (columnIndex == 1) {
			return s.roll;
		}
		return s.gpa;
	}

}
