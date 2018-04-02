package coll.Matrix;

import java.util.*;

public class Matrix<T> implements Iterable<T> {

	ArrayList<ArrayList<T>> array;
	int columns;
	int rows;
	
	/**
	 * Construct a Matrix object.
	 * 
	 * @param rows. An int that specifies the number of rows.
	 * @param columns. An int that specifies the number of columns.
	 */
	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		array = new ArrayList<ArrayList<T>>();
		for(int i=0;i<rows;i++) {
			array.add(new ArrayList<T>());
			for(int j=0;j<columns;j++) {
				array.get(i).add(null);
			}
		}
	}

	/**
	 * Assigns a value to a given cell, specified by its row, column coordinates.
	 * 
	 * @param row. An int for the row index with 0-based indexing.
	 * @param column. An int for the column index with 0-based indexing.
	 * @param value. A generic value to be assigned to the given cell.
	 */
	public void insert(int row, int column, T value) {
		if (row <= this.rows && column <= this.columns) {
			array.get(row).set(column, value);
		}
	}

	/**
	 * Gets the value at a given cell, specified by its row, column coordinates.
	 * @param row. An int for the row index with 0-based indexing.
	 * @param column. An int for the column index with 0-based indexing.
	 * @return value. A generic value located at the given cell.
	 */
	public T get(int row, int column) {
		if (row <= this.rows && column <= this.columns) {
			return array.get(row).get(column);
		} else {
			return null;
		}
	}

	/**
	 * Gets the total number of cells in the matrix.
	 * @return an int equal to the total number of cells in the matrix.
	 */
	public int size() {
		return rows * columns;
	}
	
	/**
	 * Converts the matrix to String format.
	 * @return a String representation of the matrix.
	 */
	public String toString() {
		StringBuilder matrixOutput =new StringBuilder();
		for(int i=0; i<rows; i++) {
			for(int ii=0; ii<columns; ii++) {
				matrixOutput.append(array.get(i).get(ii).toString());
				if (ii != columns - 1) {
					matrixOutput.append("\t");
				}
			}
			if (i != rows - 1) {
				matrixOutput.append("\n");
			}
		}
		return matrixOutput.toString();
	}

	/**
	 * Returns an Iterator object for the matrix. The Iterator should follow the
	 * order of row by row. Within each row the order is left to right.
	 * @return an Iterator object for the matrix.
	 */
	public Iterator iterator() {
		ArrayList<T> iter = new ArrayList<T>(rows*columns);
		for(int i=0; i<rows; i++) {
			for(int ii=0; ii<columns; ii++) {
				iter.add(array.get(i).get(ii));
			}
		}
		return iter.iterator();
	}

}