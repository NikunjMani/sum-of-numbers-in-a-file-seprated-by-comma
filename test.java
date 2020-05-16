import java.io.*;
import java.util.*;
public class test {
	void createFile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File name, Start and End number");
		String f=sc.nextLine();
		int startNumber=sc.nextInt();
		int endNumber=sc.nextInt();
		File a =new File(f+".txt");
		try {
			FileWriter fr=new FileWriter(a,false);
			fr.flush();
			fr.close();
			fr=new FileWriter(a,true);
			BufferedWriter br=new BufferedWriter(fr);
			for(Integer i=startNumber;i<=endNumber;i++) {
				if(i==100) {
					br.write(i.toString());
				}
				else {
					br.write(i.toString());
					br.write(",");
				}
			}
			br.close();
			fr.close();
			if(a.isFile()) {
				System.out.println("File created");
			}
			else {
				System.out.println("error");
			}
	    }
		catch(IOException e) {
			System.out.print(e);
		}
	}
	void printFile() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter file name to display");
			String f=sc.nextLine();
			File a=new File(f+".txt");
			Scanner s=new Scanner(a);
			while(s.hasNextLine()) {
				String data=s.nextLine();
				System.out.println(data);
			}
			s.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("error");
		}
	}	
	void calculate_file() {
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter file name to display");
		String f=sca.nextLine();
		File a=new File(f+".txt");
		try {
			Scanner sc=new Scanner(a);
			while(sc.hasNextLine()) {
				String data=sc.nextLine();
				String[] s=data.split(",");
				int size=s.length;
				int[] arr= new int[size];
				for(int i=0;i<s.length;i++) {
					arr[i]=Integer.parseInt(s[i]);
				}
				int cal=0;
				for(int i=0;i<arr.length;i++) {
				cal=cal+arr[i];
				}
				System.out.print("sum of this file is:"+cal);
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.print("error");
		}
	}
	public static void main(String args[]) {
		test b=new test();
		System.out.println("enter no. of file");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n+1;i++) {
			System.out.println(i+" File");
			b.createFile();
		}
		for(int i=1;i<n+1;i++) {
			System.out.println(i+" File");
			b.printFile();
		}
		for(int i=1;i<n+1;i++) {
			System.out.println(i+" File");
			b.calculate_file();
		}
		
	}

}
