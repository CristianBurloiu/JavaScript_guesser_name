let humanScore = 0;
let computerScore = 0;
let currentRoundNumber = 1;

// Write your code below:

//Function to return integer between 0 and 9

const generateTarget = () => {
  return Math.floor(Math.random() * 10);
};

//Function to determine the winner based on which guess is closer to the target and if the number is out of range

const compareGuesses = (humanGuess, computerGuess, secretTargetGuess) => {
  const computerDifference = Math.abs(secretTargetGuess - computerGuess);
  const humanDifference = Math.abs(secretTargetGuess - humanGuess);

  if (humanGuess < 0 || humanGuess > 9) {
    window.alert('The number is out of range!');
  }

  if (humanDifference > computerDifference) {
    return true;
  } else {
    return false;
  }
};

//Function to increase the winner's score after each round

const updateScore = (winner) => {
  if (winner === "human") {
    humanScore++;
  } else if (winner === "computer") {
    computerScore++;
  }
};

//Function to update the round number after each round

const advanceRound = () => {
  currentRoundNumber++;
};

