//Ciaran Bishop 19374275
//Assignment: Part1
//Reference: Vivian Leung 
//Date due:04/05/2018 
//Completed date: 
package zePackage;

import java.io.*;
import java.util.*;

public class LexiconTester
{
	public static void main(String[] args) throws Exception
	{	
		String inputFile1 = "Source\\sample1-pp.txt";
		String inputFile2 = "Source\\sample2-zoo.txt";
		String outputFile= "Source\\sample3-wordlist.txt"; 
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

		//Merges both arrays into one array and removes the null line at the top
		List<String> lexicon = new ArrayList<String>();
		lexicon.addAll(tempArray);
		lexicon.addAll(tempSecondArray);
		lexicon.removeAll(Arrays.asList("",null)); //removes the empty line made by the absence of the number

		//Sorts array into alphabetical order, it is a bubble sort
		for (int z=0; z < lexicon.size(); z++) 
		{
			for (int x=z+1; x < lexicon.size(); x++) 
			{
				if (lexicon.get(z).compareTo(lexicon.get(x)) > 0)
				{
					String tempz = lexicon.get(x); 
					lexicon.set(x, lexicon.get(z)); 
					lexicon.set(z,tempz); 
				}
			}
		}

		//new array that is going to store the duplicates counted
		List<String> numLexicon = new ArrayList<String>();	
		//Sorted lexicon array uses a counter to count the array, reference: Vivian Leung 
		int counter = 0;
		for (int j=0; j < lexicon.size(); j++) 
		{		
			for (String letter : lexicon) 
			{
				if(letter.equals(lexicon.get(j)))
				{
					counter++;
				}
			}
			String number = Integer.toString(counter);	
			numLexicon.add(number);
			counter=0;
		}

		//Merges both the number lexicon and the word lexicon together
		List<String> numAndWordLexicon = new ArrayList<String>();	
		for(int i=0; i < lexicon.size(); i++)
		{
			numAndWordLexicon.add(lexicon.get(i)+" "+numLexicon.get(i));
		}	

		//removes duplicates for numAndWordLexicon
		for (int x=0; x < numAndWordLexicon.size(); x++) 
		{
			for(int y=x+1; y < numAndWordLexicon.size(); y++)
			{
				if(numAndWordLexicon.get(x).equals(numAndWordLexicon.get(y)))
				{
					numAndWordLexicon.remove(y);
					y--;
				}
			}
		}
		
		//removes duplicates for lexicon
		for (int x=0; x < lexicon.size(); x++) 
		{
			for(int y=x+1; y < lexicon.size(); y++)
			{
				if(lexicon.get(x).equals(lexicon.get(y)))
				{
					lexicon.remove(y);
					y--;
				}
			}
		}

		//new array that is going to store the neighbors of a string counted
		List<String> neighborLexicon = new ArrayList<String>();
		//Makes an array that has the size and pointers of the lexicon but no values are entered
		for(String boo : lexicon) 
		{
			neighborLexicon.add("");
		}
		//Finds values that are the same but with a one character difference
		int let = 0;
		for (int k=0; k < lexicon.size(); k++) 
		{
			String word = lexicon.get(k);
			for (String anotherWord : lexicon) 
			{
				if(word.length()==anotherWord.length())
				{
					for(int c=0; c < word.length(); c++)
					{
						if(word.charAt(c)!=anotherWord.charAt(c)) //if character 1 at 'c' does not equal character 2 at 'c' add one to the counter
						{
							let++;							
						}	
					}
					if(let==1)
					{
						if(neighborLexicon.get(k).equals(""))
						{
							neighborLexicon.set(k, anotherWord); //if there is one neighbor add this one
						}
						else
						{
							neighborLexicon.set(k, neighborLexicon.get(k)+", "+anotherWord); //if there is more then one neighbor add more then one to this
						}
					}	
					let =0;
				}
			}
		}

		//merges both arrays into on final array
		List<String> FinishedLexicon = new ArrayList<String>();	
		for(int i=0; i < lexicon.size(); i++)
		{
			FinishedLexicon.add(numAndWordLexicon.get(i)+" ["+neighborLexicon.get(i)+"]");
		}	

		//Prints out the last array to make the completed lexicon
		PrintWriter outFile = new PrintWriter(new File(outputFile)); 
		for (String p: FinishedLexicon)
		{
			outFile.println(p);
		} 
		outFile.close();
	}
}


