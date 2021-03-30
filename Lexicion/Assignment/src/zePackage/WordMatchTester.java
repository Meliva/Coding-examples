//Ciaran Bishop 19374275
//Assignment: Part1
//Reference: 
//Date due:04/05/2018 
//Completed date: 
package zePackage;

import java.io.*;
import java.util.*;

public class WordMatchTester
{
	public static void main(String[] args) throws Exception
	{	
		String inputFile1 = "Source\\sample1-pp.txt";
		String inputFile2 = "Source\\sample2-zoo.txt";
		String outputFile= "Source\\sample4-resuts.txt";
		File inStream1 = new File(inputFile1);
		File inStream2 = new File(inputFile2);
		Scanner reader1 = new Scanner(inStream1); 
		Scanner reader2 = new Scanner(inStream2);
		String firstLines = reader1.next();
		String secondLines = reader2.next();
		List<String> tempArray = new ArrayList<String>();
		List<String> tempSecondArray = new ArrayList<String>();

		while(reader1.hasNext()) //Scans in the first file to an array
		{
			firstLines = firstLines.replaceAll("\\d","").replaceAll("\\W","").toLowerCase();
			tempArray.add(firstLines);
			firstLines = reader1.next();
			if(!reader1.hasNext())
			{
				firstLines = firstLines.replaceAll("\\d","").replaceAll("\\W","");
				tempArray.add(firstLines);
			}
		}
		reader1.close();

		while(reader2.hasNext()) //Scans in the second file to an array
		{
			secondLines = secondLines.replaceAll("\\d","").replaceAll("\\W","").toLowerCase();
			tempSecondArray.add(secondLines);
			secondLines = reader2.next();
			if(!reader2.hasNext())
			{
				secondLines = secondLines.replaceAll("\\d","").replaceAll("\\W","");
				tempSecondArray.add(secondLines);		
			}
		}	
		reader2.close();

		//merges both arrays into one array
		List<String> wordList = new ArrayList<String>();
		wordList.addAll(tempArray);
		wordList.addAll(tempSecondArray);
		wordList.removeAll(Arrays.asList("",null)); //removes the empty line made by the absence of the number

		//Sorts array into alphabetical order, it is a bubble sort
		for (int a=0; a < wordList.size(); a++) 
		{
			for (int b=a+1; b < wordList.size(); b++) 
			{
				if (wordList.get(a).compareTo(wordList.get(b)) > 0)
				{
					String tempz = wordList.get(b); 
					wordList.set(b, wordList.get(a)); 
					wordList.set(a,tempz);
				}
			}
		}

		List<String> castList = new ArrayList<String>();
		castList.add("ma?");
		castList.add("?o?");
		castList.add("mr*");
		castList.add("i*");
		castList.add("?ear*");
		castList.add("?e");
		//Custom cases
		castList.add("?ea*");
		castList.add("??t");		
		castList.add("a*");
		castList.add("d*");		
		castList.add("?i?");
		castList.add("?a?");		
		castList.add("pr*");
		castList.add("?o");
		castList.add("??e");
		castList.add("?e*");
		//dead
		castList.add("yz*");
		castList.add("xg?");
		castList.add("?sz?");
		castList.add("?yt*");

		String testCase = null; //the case word
		String newTest = null; //the case word with out '?' or/and '*'
		int count =0; // counts duplicate words
		int let = 0; // counts characters that equal each other
		int notEqual =0; // counter for string that are not equal
		int elp = 0; //counts duplicates for removal
		List<String>finishedList = new ArrayList<String>();

		for (int v=0; v < castList.size(); v++) 
		{
			testCase = castList.get(v); //replaces the current case with a new case that is pointing at 'v'
			if(testCase.endsWith("*")&&testCase.startsWith("?"))
			{
				newTest = testCase.replace("*","").replace("?","");
				finishedList.add("The pattern:"+"\n"+" "+testCase+"\n"+" May result in the output:");
				for (int c=0; c < wordList.size(); c++) 
				{
					String cip = wordList.get(c);
					for(int d = 0; d < testCase.length()-1; d++)
					{
						if(cip.contains(newTest))
						{
							if(cip.charAt(d)==testCase.charAt(d))
							{
								let++;
								notEqual++;
							}	
						}
					}
					if(let==newTest.length())
					{
						for (String dup : wordList) 
						{
							if(dup.equals(cip))
							{
								count++;
							}
						}
						finishedList.add(" "+cip+" "+count);
					}
					let=0;
					count=0;
				}
				//Removes duplicates from the Array that is going to be printed (allows cases to have the same values at the cost of doubles in the same case)
				for (int i=0; i < finishedList.size(); i++) 
				{		
					for(int j=i+1; j < finishedList.size(); j++)
					{
						if(finishedList.get(i).equals(finishedList.get(j)))
						{
							elp++;
							if(elp > 1)
							{
								finishedList.remove(j);
								j--;
							}
						}											
					}
					elp =0;	
				}		
			}
			else if(testCase.endsWith("*"))
			{
				newTest = testCase.replace("*","");
				finishedList.add("The pattern:"+"\n"+" "+testCase+"\n"+" May result in the output:");
				for (int e=0; e < wordList.size(); e++) 
				{	
					String eip = wordList.get(e);
					if(eip.startsWith(newTest))
					{
						for (String dup : wordList) 
						{
							if(dup.equals(eip))
							{
								count++;
							}
						}
						notEqual++;
						finishedList.add(" "+eip+" "+count);
					}
					count = 0;
				}
				//Removes duplicates from the Array that is going to be printed (allows cases to have the same values at the cost of doubles in the same case)
				for (int i=0; i < finishedList.size(); i++) 
				{		
					for(int j=i+1; j < finishedList.size(); j++)
					{
						if(finishedList.get(i).equals(finishedList.get(j)))
						{
							elp++;
							if(elp > 1)
							{
								finishedList.remove(j);
								j--;
							}
						}											
					}
					elp =0;	
				}		
			}
			else if(testCase.endsWith("?")||testCase.startsWith("?")&&testCase.endsWith("?"))
			{
				newTest = testCase.replace("?","");
				finishedList.add("The pattern:"+"\n"+" "+testCase+"\n"+" May result in the output:");
				for (int f=0; f < wordList.size(); f++) 
				{
					String fip = wordList.get(f);	
					if(fip.length()==testCase.length())
					{
						for(int j=0; j < fip.length()-1; j++)
						{
							if(fip.charAt(j)==testCase.charAt(j))
							{
								let++;
								notEqual++;
							}	
						}
						if(let == newTest.length())
						{
							for (String dup : wordList) 
							{
								if(dup.equals(fip))
								{
									count++;
								}
							}
							finishedList.add(" "+fip+" "+count);						
						}
						count= 0;
						let = 0;
					}
				}
				//Removes duplicates from the Array that is going to be printed (allows cases to have the same values at the cost of doubles in the same case)
				for (int i=0; i < finishedList.size(); i++) 
				{		
					for(int j=i+1; j < finishedList.size(); j++)
					{
						if(finishedList.get(i).equals(finishedList.get(j)))
						{
							elp++;
							if(elp > 1)
							{
								finishedList.remove(j);
								j--;
							}
						}											
					}
					elp =0;	
				}	
			}		
			else if(testCase.startsWith("?"))
			{
				newTest = testCase.replace("?","");
				finishedList.add("The pattern:"+"\n"+" "+testCase+"\n"+" May result in the output:");
				for (int g=0; g < wordList.size(); g++) 
				{
					String gip = wordList.get(g);	
					if(gip.length()==testCase.length())
					{
						for(int h=0; h < gip.length(); h++)
						{
							if(gip.charAt(h)==testCase.charAt(h))
							{
								let++;
								notEqual++;
							}	
						}
						if(let == newTest.length())
						{
							for (String dup : wordList) 
							{
								if(dup.equals(gip))
								{
									count++;
								}
							}
							finishedList.add(" "+gip+" "+count);						
						}
						count= 0;
						let = 0;
					}
				}
				//Removes duplicates from the Array that is going to be printed (allows cases to have the same values at the cost of doubles in the same case)
				for (int i=0; i < finishedList.size(); i++) 
				{		
					for(int j=i+1; j < finishedList.size(); j++)
					{
						if(finishedList.get(i).equals(finishedList.get(j)))
						{
							elp++;
							if(elp > 1)
							{
								finishedList.remove(j);
								j--;
							}
						}											
					}
					elp =0;	
				}			
			}
			if(notEqual == 0) //words that are equal to the list are counted this goes off if the case has not been matched with the list of the array
			{
				finishedList.add(" the pattern: has no words in here to match");
			}
			notEqual = 0; //Sets to counter to 0 so that it does not miss any values that do not match
		}

		//Prints out the completed WordMatchers
		PrintWriter outFile = new PrintWriter(new File(outputFile)); 	
		for (String str: finishedList)
		{			
			outFile.println(str);
		}      		
		outFile.close();		
	}
}
