class Patient1{
		  
		  
		 static String  patientName ;
	     static long  patientContactNo ;
		 static int patientAge ;
		 static String bloodGroup ;
		 static String patientDisease ;
		 static char patientWard ;
		 static boolean isAlive ;
		
        public static void main(String patient[]){
		System.out.println("invoking variables before initialization");
		System.out.println("=-------------------========");
		System.out.println("Patient's Phone No is " +patientContactNo +"\n"+"Patient's Name is " + patientName +"\n"+"Patient's Ward is " + patientWard + "  " + patientDisease  +  "  " + isAlive);
		
		patientName="kotwal";
		patientContactNo=9901629443l;
		patientAge=67;
		patientDisease="sugar";
		patientWard='A';
		isAlive=true;
		
		System.out.println("invoking variables after initialization");
		System.out.println("=-------------------========");
		System.out.println("Patient's Phone No is " +patientContactNo +"\n"+"Patient's Name is " + patientName +"\n"+"Patient's Ward is " + patientWard + "  " + patientDisease  +  "  " + isAlive);
		
		
}
}	