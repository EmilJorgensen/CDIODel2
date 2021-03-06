package main;
/**
 * @Author Aleksander.
 * This class holds the responsibility to manage the players individual score.
 */
public class Account {

	private int Balance;
	private int MIN=0;

	/**
	 * @param Account Constructor. Creates an Account object with the initial balance of 1000
	 * @param Balance the players amount of Goldcoins.
	 */
public Account()	
{
		Balance = 1000;
}
	
/**
 * Calculates the player's balance. This is done by having the value from the CustomField array, specified by the shakervalue, added to the score. 
 * @param point the integer value to be added to the balance.
 * @param minBalance is there to make sure the balance does not go under 0.
 * @return Balance
 */
public int setBalance(int point)
{
	Balance = Balance + point;
	minBalance();
	return Balance;
}

/**
 * Returns the player's current balance.
 * @return Balance
 */
public int getBalance()
{
	return Balance;
}
/**
 * Makes sure the player's balance can't get below 0
 */
private int minBalance()
{
	if (Balance <= MIN){
		Balance=0;
	}
	return Balance;
}
/**
 * Converts the Balance from an integer to a string.
 */
public String toString()
{
	return Integer.toString(Balance);
}
}