class Hospital{
	public static String[] findDoctorsBySpecialization(String specialization){
		System.out.println("invocked the findDoctorsBySpecialization method");

		if (specialization == "General Medicine") {
			String[] doctors = {"Dr. Anitha", "Dr. Yashwanth", "Dr. Ishaan", "Dr. Meera", "Dr. Vivaan", "Dr. Anaya", "Dr. Reyansh", "Dr. Saanvi", "Dr. Advik", "Dr. Myra", "Dr. Kabir", "Dr. Aadhya", "Dr. Arnav", "Dr. Siya", "Dr. Vihaan"};
			return doctors;

		} else if (specialization == "Ortho") {
			String[] doctors = {"Dr. Rithvik", "Dr. Tanvi", "Dr. Krish", "Dr. Pihu", "Dr. Ayaan", "Dr. Kiara", "Dr. Dev", "Dr. Nitya", "Dr. Samar", "Dr. Ira", "Dr. Kunal", "Dr. Trisha", "Dr. Yuvan", "Dr. Mahika", "Dr. Rudra"};
			return doctors;

		} else if (specialization == "Cardiology") {
			String[] doctors = {"Dr. Aditya", "Dr. Shanaya", "Dr. Pranav", "Dr. Riya", "Dr. Laksh", "Dr. Anvi", "Dr. Shaurya", "Dr. Kavisha", "Dr. Manan", "Dr. Navya", "Dr. Aryan", "Dr. Eesha", "Dr. Om", "Dr. Harini", "Dr. Ved"};
			return doctors;

		} else if (specialization == "Dermatology") {
			String[] doctors = {"Dr. Zara", "Dr. Aisha", "Dr. Zain", "Dr. Huda", "Dr. Farhan", "Dr. Inaya", "Dr. Sameer", "Dr. Alina", "Dr. Imran", "Dr. Sana", "Dr. Rehan", "Dr. Mariam", "Dr. Danish", "Dr. Noor", "Dr. Arisha"};
			return doctors;

		} else if (specialization == "Neurology") {
			String[] doctors = {"Dr. Tejas", "Dr. Vaidehi", "Dr. Siddharth", "Dr. Ishita", "Dr. Mihir", "Dr. Roshni", "Dr. Neel", "Dr. Avni", "Dr. Hrithik", "Dr. Charvi", "Dr. Parth", "Dr. Tanisha", "Dr. Daksh", "Dr. Kriti", "Dr. Viraj"};
			return doctors;

		} else if (specialization == "Pediatrics") {
			String[] doctors = {"Dr. Aarohi", "Dr. Vivaan", "Dr. Ansh", "Dr. Riddhi", "Dr. Aaryan", "Dr. Kavya", "Dr. Vihaan", "Dr. Mysha", "Dr. Dhruv", "Dr. Aanya", "Dr. Reya", "Dr. Aarush", "Dr. Vanya", "Dr. Krisha", "Dr. Ishvik"};
			return doctors;

		} else if (specialization == "Oncology") {
			String[] doctors = {"Dr. Prisha", "Dr. Aaravita", "Dr. Kianraj", "Dr. Aarna", "Dr. Rohanveer", "Dr. Saisha", "Dr. Vivika", "Dr. Aadhvik", "Dr. Kianna", "Dr. Devika", "Dr. Yashit", "Dr. Ishwin", "Dr. Tanaya", "Dr. Raghavendra", "Dr. Meher"};
			return doctors;

		} else if (specialization == "Psychiatry") {
			String[] doctors = {"Dr. Kavish", "Dr. Shanvika", "Dr. Aariz", "Dr. Samaira", "Dr. Arjunesh", "Dr. Nyra", "Dr. Zayan", "Dr. Anvika", "Dr. Advay", "Dr. Saira", "Dr. Ishir", "Dr. Haniya", "Dr. Lakshay", "Dr. Myrah", "Dr. Arya"};
			return doctors;

		} else if (specialization == "Gastroenterology") {
			String[] doctors = {"Dr. Tanish", "Dr. Aditi", "Dr. Kabirraj", "Dr. Rhea", "Dr. Arnavit", "Dr. Naira", "Dr. Yuvaan", "Dr. Jiya", "Dr. Reyanshika", "Dr. Diyansh", "Dr. Anirudh", "Dr. Tara", "Dr. Vihaana", "Dr. Zoya", "Dr. Samarth"};
			return doctors;

		} else if (specialization == "ENT") {
			String[] doctors = {"Dr. Aaryav", "Dr. Ruhi", "Dr. Darshil", "Dr. Anika", "Dr. Shaan", "Dr. Kavina", "Dr. Prithvi", "Dr. Iyla", "Dr. Aarush", "Dr. Ziva", "Dr. Devansh", "Dr. Avika", "Dr. Kairav", "Dr. Riyaansh", "Dr. Mahira"};
			return doctors;

		} else if (specialization == "Ophthalmology") {
			String[] doctors = {"Dr. Veer", "Dr. Anshika", "Dr. Abeer", "Dr. Tanirika", "Dr. Samyak", "Dr. Hridya", "Dr. Ronav", "Dr. Lavanya", "Dr. Keshav", "Dr. Aashvi", "Dr. Ishaanvi", "Dr. Devraj", "Dr. Mishka", "Dr. Pranay", "Dr. Charit"};
			return doctors;

		} else if (specialization == "Urology") {
			String[] doctors = {"Dr. Naman", "Dr. Aarika", "Dr. Yatin", "Dr. Bhavya", "Dr. Rachit", "Dr. Eshita", "Dr. Lakshit", "Dr. Anusha", "Dr. Tanay", "Dr. Vaanya", "Dr. Shaurya", "Dr. Kritika", "Dr. Manvik", "Dr. Aahana", "Dr. Reyaan"};
			return doctors;

		} else if (specialization == "Nephrology") {
			String[] doctors = {"Dr. Vividh", "Dr. Jhanvi", "Dr. Aarushdeep", "Dr. Siyaara", "Dr. Harshit", "Dr. Samyukta", "Dr. Nivaan", "Dr. Rishika", "Dr. Abeer", "Dr. Tvesha", "Dr. Dakshit", "Dr. Iraaya", "Dr. Param", "Dr. Aarna", "Dr. Devika"};
			return doctors;

		} else if (specialization == "Pulmonology") {
			String[] doctors = {"Dr. Viresh", "Dr. Shanvika", "Dr. Arham", "Dr. Riyana", "Dr. Kiyan", "Dr. Ishvika", "Dr. Samarjit", "Dr. Avniya", "Dr. Reyaansh", "Dr. Prisha", "Dr. Yuva", "Dr. Tanirika", "Dr. Lakshya", "Dr. Myesha", "Dr. Aarvin"};
			return doctors;

		} else if (specialization == "Endocrinology") {
			String[] doctors = {"Dr. Pratham", "Dr. Kavisha", "Dr. Hriday", "Dr. Srishti", "Dr. Atharv", "Dr. Samriddhi", "Dr. Vedant", "Dr. Nysha", "Dr. Arjit", "Dr. Vamika", "Dr. Ivaan", "Dr. Rishita", "Dr. Aayansh", "Dr. Iraana", "Dr. Devyansh"};
			return doctors;

		}		else if (specialization == "Rheumatology") {
			String[] doctors = {"Dr. Kriday", "Dr. Shanviya", "Dr. Arushman", "Dr. Tiyana", "Dr. Devit", "Dr. Roshika", "Dr. Mihika", "Dr. Aarjit", "Dr. Vivaanth", "Dr. Yashika", "Dr. Tanvay", "Dr. Ishvika", "Dr. Harnoor", "Dr. Avyukt", "Dr. Saanvika"};
			return doctors;

		} else if (specialization == "Gynecology") {
			String[] doctors = {"Dr. Meenakshi", "Dr. Kavitha", "Dr. Haripriya", "Dr. Nandita", "Dr. Shruthi", "Dr. Vaishnavi", "Dr. Deepika", "Dr. Bhavana", "Dr. Lalitha", "Dr. Swathi", "Dr. Rohini", "Dr. Janani", "Dr. Pavithra", "Dr. Hema", "Dr. Chandrika"};
			return doctors;

		} else if (specialization == "Radiology") {
			String[] doctors = {"Dr. Arvind", "Dr. Lekha", "Dr. Santhosh", "Dr. Madhavi", "Dr. Pradeep", "Dr. Nisha", "Dr. Karthika", "Dr. Sudeep", "Dr. Harsha", "Dr. Deepthi", "Dr. Lokesh", "Dr. Namitha", "Dr. Sagar", "Dr. Aishwarya", "Dr. Tarun"};
			return doctors;

		} else if (specialization == "Pathology") {
			String[] doctors = {"Dr. Mahesh", "Dr. Ranjani", "Dr. Srikar", "Dr. Pooja", "Dr. Vinod", "Dr. Keerthi", "Dr. Ajay", "Dr. Raksha", "Dr. Dinesh", "Dr. Lavanya", "Dr. Naveen", "Dr. Meghana", "Dr. Gokul", "Dr. Tejal", "Dr. Abhinav"};
			return doctors;

		} else if (specialization == "Anesthesiology") {
			String[] doctors = {"Dr. Harish", "Dr. Sahana", "Dr. Nikhil", "Dr. Poonam", "Dr. Rahul", "Dr. Bhavani", "Dr. Arpith", "Dr. Charitha", "Dr. Manish", "Dr. Radhika", "Dr. Vivek", "Dr. Shilpa", "Dr. Kiran", "Dr. Preethi", "Dr. Varun"};
			return doctors;

		} else if (specialization == "Hematology") {
			String[] doctors = {"Dr. Abhay", "Dr. Roshitha", "Dr. Sameer", "Dr. Jyothi", "Dr. Keshav", "Dr. Harini", "Dr. Pranay", "Dr. Tanisha", "Dr. Mohit", "Dr. Snehal", "Dr. Anmol", "Dr. Ritika", "Dr. Arjun", "Dr. Kavina", "Dr. Vishal"};
			return doctors;

		} else if (specialization == "Infectious Disease") {
			String[] doctors = {"Dr. Sudhir", "Dr. Nayana", "Dr. Rohit", "Dr. Padmini", "Dr. Teerth", "Dr. Swarna", "Dr. Hitesh", "Dr. Nithya", "Dr. Amar", "Dr. Priyanka", "Dr. Siddhi", "Dr. Rakshit", "Dr. Neeraj", "Dr. Veda", "Dr. Suman"};
			return doctors;

		} else if (specialization == "Emergency Medicine") {
			String[] doctors = {"Dr. Armaan", "Dr. Ishika", "Dr. Ritesh", "Dr. Sakshi", "Dr. Yuvraj", "Dr. Parnika", "Dr. Hrishik", "Dr. Tanmayi", "Dr. Nehal", "Dr. Mahati", "Dr. Akarsh", "Dr. Driti", "Dr. Sarthak", "Dr. Vihana", "Dr. Omkar"};
			return doctors;

		} else if (specialization == "Geriatrics") {
			String[] doctors = {"Dr. Srinivas", "Dr. Jayalakshmi", "Dr. Ramesh", "Dr. Bharti", "Dr. Subhash", "Dr. Latha", "Dr. Murali", "Dr. Sandhya", "Dr. Narayan", "Dr. Geetha", "Dr. Shankar", "Dr. Savitha", "Dr. Prakash", "Dr. Usha", "Dr. Raghunath"};
			return doctors;

		} else if (specialization == "Plastic Surgery") {
			String[] doctors = {"Dr. Akhil", "Dr. Reema", "Dr. Sushant", "Dr. Tanushree", "Dr. Karthikeya", "Dr. Mitali", "Dr. Pravin", "Dr. Ayesha", "Dr. Lakhan", "Dr. Nandini", "Dr. Rohil", "Dr. Simran", "Dr. Harit", "Dr. Zaina", "Dr. Darshan"};
			return doctors;

		} else if (specialization == "Neurosurgery") {
			String[] doctors = {"Dr. Chinmay", "Dr. Ishani", "Dr. Ravindra", "Dr. Parnavi", "Dr. Shreyas", "Dr. Manya", "Dr. Gaurav", "Dr. Aarna", "Dr. Nishant", "Dr. Riddhima", "Dr. Vaibhav", "Dr. Krutika", "Dr. Omkar", "Dr. Tanirika", "Dr. Devyani"};
			return doctors;

		} else if (specialization == "General Surgery") {
			String[] doctors = {"Dr. Abhishek", "Dr. Kalyani", "Dr. Rohini", "Dr. Manohar", "Dr. Kaviraj", "Dr. Divyanshi", "Dr. Hemanth", "Dr. Supriya", "Dr. Tejasvi", "Dr. Rakul", "Dr. Sharath", "Dr. Bhargavi", "Dr. Vikrant", "Dr. Aishita", "Dr. Paramesh"};
			return doctors;

		} else if (specialization == "Cardiothoracic Surgery") {
			String[] doctors = {"Dr. Devendra", "Dr. Tanirika", "Dr. Prabhakar", "Dr. Hridya", "Dr. Nishchal", "Dr. Keerthana", "Dr. Sandeep", "Dr. Manvitha", "Dr. Raghav", "Dr. Sanika", "Dr. Madhusudhan", "Dr. Vismaya", "Dr. Lokendra", "Dr. Nivetha", "Dr. Shivan"};
			return doctors;

		} else if (specialization == "Vascular Surgery") {
			String[] doctors = {"Dr. Amarendra", "Dr. Harshita", "Dr. Rithesh", "Dr. Charvi", "Dr. Aayush", "Dr. Anvika", "Dr. Tanmay", "Dr. Mahira", "Dr. Siddharth", "Dr. Vaishali", "Dr. Gautham", "Dr. Rishika", "Dr. Dhruvan", "Dr. Ishita", "Dr. Yajna"};
			return doctors;

		} else if (specialization == "Neonatology") {
			String[] doctors = {"Dr. Koushik", "Dr. Sneha", "Dr. Ronav", "Dr. Aarika", "Dr. Devansh", "Dr. Vanya", "Dr. Samrat", "Dr. Ira", "Dr. Aarush", "Dr. Myra", "Dr. Riaan", "Dr. Kiara", "Dr. Tejith", "Dr. Avika", "Dr. Ridhima"};
			return doctors;

		}		else if (specialization == "Immunology") {
			String[] doctors = {"Dr. Abeer", "Dr. Roshani", "Dr. Kunalraj", "Dr. Tanirika", "Dr. Sudeep", "Dr. Mythili", "Dr. Arhaan", "Dr. Varnika", "Dr. Devraj", "Dr. Samyukta", "Dr. Ishwin", "Dr. Lavisha", "Dr. Ritesh", "Dr. Charika", "Dr. Zayan"};
			return doctors;

		} else if (specialization == "Physical Medicine") {
			String[] doctors = {"Dr. Harshvardhan", "Dr. Keerthi", "Dr. Manvik", "Dr. Rishmita", "Dr. Tejveer", "Dr. Anvitha", "Dr. Lokeshwar", "Dr. Niharika", "Dr. Aaryan", "Dr. Parnika", "Dr. Sharvith", "Dr. Ishika", "Dr. Darshan", "Dr. Tanisha", "Dr. Prayan"};
			return doctors;

		} else if (specialization == "Sports Medicine") {
			String[] doctors = {"Dr. Yuvansh", "Dr. Mihira", "Dr. Karthikeyan", "Dr. Aishani", "Dr. Raghunandan", "Dr. Devyanka", "Dr. Suryansh", "Dr. Vaidehi", "Dr. Abhinay", "Dr. Samaira", "Dr. Lakshit", "Dr. Ridhvika", "Dr. Omveer", "Dr. Nysha", "Dr. Aaritra"};
			return doctors;

		} else if (specialization == "Pain Management") {
			String[] doctors = {"Dr. Chinmayee", "Dr. Harendra", "Dr. Vivekanth", "Dr. Shanvika", "Dr. Devashish", "Dr. Aarohi", "Dr. Mahendra", "Dr. Ishwarya", "Dr. Saanvik", "Dr. Prarthana", "Dr. Tanush", "Dr. Avishi", "Dr. Gauransh", "Dr. Roshitha", "Dr. Adhira"};
			return doctors;

		} else if (specialization == "Sleep Medicine") {
			String[] doctors = {"Dr. Nishkarsh", "Dr. Aashrita", "Dr. Reyaansh", "Dr. Vaishnavi", "Dr. Harit", "Dr. Charulata", "Dr. Devadatt", "Dr. Mihika", "Dr. Rithvikraj", "Dr. Saanviya", "Dr. Kian", "Dr. Samriddhi", "Dr. Ariv", "Dr. Tanirika", "Dr. Yashvi"};
			return doctors;

		} else if (specialization == "Palliative Care") {
			String[] doctors = {"Dr. Mahadev", "Dr. Bhavini", "Dr. Raghavendra", "Dr. Shalini", "Dr. Devyash", "Dr. Hemaangi", "Dr. Sudev", "Dr. Anika", "Dr. Haroon", "Dr. Lakshita", "Dr. Pradyumna", "Dr. Roshika", "Dr. Aarushman", "Dr. Devyani", "Dr. Viransh"};
			return doctors;

		} else if (specialization == "Hepatology") {
			String[] doctors = {"Dr. Tejaswin", "Dr. Kaviraj", "Dr. Nishita", "Dr. Arpit", "Dr. Shrivalli", "Dr. Manasvi", "Dr. Darshit", "Dr. Riyaana", "Dr. Devendra", "Dr. Samyukth", "Dr. Harnoor", "Dr. Tanmayee", "Dr. Viresh", "Dr. Navika", "Dr. Rishan"};
			return doctors;

		} else if (specialization == "Critical Care") {
			String[] doctors = {"Dr. Amarjit", "Dr. Vismaya", "Dr. Loknath", "Dr. Sharvani", "Dr. Devang", "Dr. Aayushi", "Dr. Keshavan", "Dr. Trinaya", "Dr. Pranesh", "Dr. Saanvika", "Dr. Aaravdeep", "Dr. Ishvika", "Dr. Tanveer", "Dr. Rachika", "Dr. Yuvanraj"};
			return doctors;

		} else if (specialization == "Medical Genetics") {
			String[] doctors = {"Dr. Chinraj", "Dr. Aarna", "Dr. Devika", "Dr. Harivansh", "Dr. Rishita", "Dr. Kairav", "Dr. Samyukta", "Dr. Arnavraj", "Dr. Myesha", "Dr. Tanirika", "Dr. Vaibhav", "Dr. Ishita", "Dr. Aaryav", "Dr. Kavisha", "Dr. Prithvi"};
			return doctors;

		} else if (specialization == "Occupational Medicine") {
			String[] doctors = {"Dr. Madhavan", "Dr. Charitha", "Dr. Suryadev", "Dr. Harshika", "Dr. Riteshwar", "Dr. Anvaya", "Dr. Lokendra", "Dr. Prisha", "Dr. Nishanth", "Dr. Devyanka", "Dr. Aarvin", "Dr. Samaira", "Dr. Tanmay", "Dr. Varnika", "Dr. Yajur"};
			return doctors;

		} else if (specialization == "Podiatry") {
			String[] doctors = {"Dr. Shivanth", "Dr. Keerthika", "Dr. Raghul", "Dr. Ishwarya", "Dr. Devith", "Dr. Myrah", "Dr. Aarush", "Dr. Ridhima", "Dr. Lakshan", "Dr. Tanvitha", "Dr. Saanvik", "Dr. Charvi", "Dr. Omraj", "Dr. Nyra", "Dr. Abeer"};
			return doctors;
		}

		return null;
	}

	public static void getDoctors(String[] doctors){
		System.out.println("Fetching Doctors name!!!!");
		for(String doctor:doctors){
			System.out.println(doctor);
		}
		System.out.println("above are the doctors name");
	}
}