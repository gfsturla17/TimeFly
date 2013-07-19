//----------------------------------------------------------------------
// ArrayStringLog.java        by Dale/Joyce/Weems              Chapter 2
//
// Implements StringLogInterface using an array to hold the strings.
//----------------------------------------------------------------------

package ch02.stringLogs;

public class ArrayStringLog implements StringLogInterface 
{
  protected String name;              // name of this StringLog
  protected String[] log;             // array that holds strings
  protected int lastIndex = -1;       // index of last string in array
  protected String element;
  protected String[] delete;
  protected String smallest;

  public ArrayStringLog(String name, int maxSize)
  // Precondition:   maxSize > 0
  //
  // Instantiates and returns a reference to an empty ArrayStringLog 
  // object with name "name" and room for maxSize strings.
  {
    log = new String[maxSize];
    this.name = name;
  }

  public ArrayStringLog(String name) 
  // Instantiates and returns a reference to an empty ArrayStringLog
  // object with name "name" and room for 100 strings.
  {
    log = new String[100];
    this.name = name;
  }
  
  public ArrayStringLog(){
	  log = new String[100];
	  name = "noId";
  }

  public void insert(String element)
  // Precondition:   This StringLog is not full.
  //
  // Places element into this StringLog.
  {      
    lastIndex++;
    log[lastIndex] = element;
  }

  public boolean isFull()
  // Returns true if this StringLog is full, otherwise returns false.
  {              
    if (lastIndex == (log.length - 1)) 
      return true;
    else
      return false;
  }
  
  public boolean isEmpty()
  {
	  if(lastIndex == -1){
		  return true;
	  }else{
		  return false;
	  }
  }
  
  public int size()
  // Returns the number of Strings in this StringLog.
  {
    return (lastIndex + 1);
  }
  
  public boolean contains(String element)
  // Returns true if element is in this StringLog,
  // otherwise returns false.
  // Ignores case differences when doing string comparison.
  {                 
    int location = 0;
    while (location <= lastIndex) 
    {
      if (element.equalsIgnoreCase(log[location]))  // if they match
        return true;
      else
        location++;
    }
   return false;
  }
  
  public void clear()
  // Makes this StringLog empty.
  {                  
    for (int i = 0; i <= lastIndex; i++)
      log[i] = null;
    lastIndex = -1;
  }
  
  public int deleteAll(String element){
	  int count = 0;
	  int keep = 0;
	  delete = new String[log.length];
	  
	  for(int i = 0; i<log.length; i++){
		 
		  if(!element.equals(log[i])){
			  delete[keep]=log[i];
			   keep++; 
		  }else{
			  count++;
		  }
		  
	
	  }
	  for(int i = 0; i<delete.length; i++){
		  log[i]=delete[i];
	  }
	lastIndex = lastIndex - count;
	return count;
	  
  }

  public String getName()
  // Returns the name of this StringLog.
  {
    return name;
  }
  
  public int howMany(String element){
	  this.element = element;
	  int count = 0;
	  for(int i = 0; i<log.length; i++){
		  if(element.equals(log[i])){
			  count++;
		  }
	  }
	  return count;
	  
  }
  
  public boolean delete(String element){
	  this.element = element;
	  boolean deleted = false;
	  for(int i = 0; i<log.length; i++){
		  if(element.equals(log[i])){
			  deleted = true;
			  for(int j = i; j<log.length-1; j++){
				  log[j]= log[j+1];
				
			  }
			  lastIndex--;
			  i = log.length;
		  }
	  }
	  return deleted;
  }
  
  public boolean uniqInsert(String element){
	  this.element = element;
	  boolean unique = true;
	  for(int i = 0; i<log.length; i++){
		  if(element.equals(log[i])){
			  unique=false;
			  i = log.length;
		  }
	  }
	  if(unique){
		  lastIndex++;
		  log[lastIndex] = element;
		  return unique;
	  }else{
		  return unique;
	  }
	  
  }
  
  public String smallest(){
	  smallest = log[0];
	  for(int i = 1; i<lastIndex; i++){
		  if(smallest.compareTo(log[i])> 0){
			  smallest = log[i];
		  }
	  }
	  return smallest;
  }

  public String toString()
  // Returns a nicely formatted string representing this StringLog.
  {
    String logString = "Log: " + name + "\n\n";
    
    for (int i = 0; i <= lastIndex; i++)
      logString = logString + (i+1) + ". " + log[i] + "\n";
      
    return logString;
  }
}