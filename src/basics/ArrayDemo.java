package basics;

/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */
public class ArrayDemo {
	public static void main(String[] args) {
//		array declaration
		int[] marks = new int[6];

//		store the values in an array
		marks[0] = 19;
		marks[1] = 17;
		marks[2] = 18;
		marks[3] = 16;
		marks[4] = 15;
		marks[5] = 18;

//		retrieve the data from array
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);

//		length of an array : the number of values inside an array
		System.out.println(marks.length);

//		initialize a 1D array
		String[] subjects = { "Telugu", "English", "Hindi", "Science", "Social", "Maths" };

//		2D arrays
		int[][] matrix1 = new int[2][2];

//		storing values
		matrix1[0][0] = 10;
		matrix1[0][1] = 11;
		matrix1[1][0] = 12;
		matrix1[1][1] = 13;

//		initialize the 2D array
		int[][] marksOfStudents = { { 18, 19, 12, 14, 17, 16 }, { 13, 14, 16, 18, 19, 16 },
				{ 14, 15, 18, 18, 19, 20 } };

	}

}
