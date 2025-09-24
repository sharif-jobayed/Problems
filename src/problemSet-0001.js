

/*-------------------------------------- Problem-0001 start --------------------------------------*/

/* const myName = "Sharif";
const BIRTH_YEAR = 1986;
const currentYear = new Date().getFullYear();
let age = currentYear - BIRTH_YEAR;
let greeting = `Hello my name is ${myName} & I'm ${age} years old.`;

console.log(greeting); */

/*-------------------------------------- Problem-0001 end --------------------------------------*/

/*-------------------------------------- Problem-0002 start --------------------------------------*/

/* const calculateGrade = (studentScore, totalPossibleScore) => {
	// 1. Handle the edge case first.
	if (studentScore > totalPossibleScore || studentScore < 0) {
		return "Invalid score";
	}

	// 2. Calculate the percentage and store it in a constant.
	const percentage = (studentScore / totalPossibleScore) * 100;

	// 3. Check grades from highest to lowest.
	if (percentage >= 90) {
		return "A";
	} else if (percentage >= 80) {
		return "B";
	} else if (percentage >= 70) {
		return "C";
	} else if (percentage >= 60) {
		return "D";
	} else {
		return "F";
	}
};

console.log(`Score: 18/20 -> Grade: ${calculateGrade(18, 20)}`); // Expected: A
console.log(`Score: 15/25 -> Grade: ${calculateGrade(15, 25)}`); // Expected: F
console.log(`Score: 21/20 -> Grade: ${calculateGrade(21, 20)}`); // Expected: Invalid score */

/*-------------------------------------- Problem-0002 end --------------------------------------*/

/*-------------------------------------- Problem-0003 start (Arrays and Loops) --------------------------------------*/

// const prices = [98, 85, 100, 76, 59];

// const discountedPrices = prices.map((price) => {
// 	const discountPercentage = 0.85;
// 	const discountedPrice = price * discountPercentage;
// 	return discountedPrice;
// });
// console.log(discountedPrices);

// const pricedOver20 = discountedPrices.filter((price) => {
// 	return price >= 20;
// });
// console.log(pricedOver20);

/*-------------------------------------- Problem-0003 end (Arrays and Loops) --------------------------------------*/

/*-------------------------------------- Problem-0004 start (Objects - Structuring Your Data) --------------------------------------*/

const myLibrary = []

for (let i = 0; i < 15; i++) {
	const setIsRead = () => {
		if (i % 2 === 0) {
			return true;
		} else {
			return false;
		}
	}

	myLibrary.push(
		{
			title: `Book ${i}`,
			author: `Writer ${i}`,
			pages: 15 * i,
			isRead: setIsRead()
		}
	);
}

console.log(myLibrary);

const finishedBooks = myLibrary.filter((book) => {
	return book.isRead === true;
});

const readingSummary = finishedBooks.map((book) => {
	return {
		title: book.title,
		author: book.author,
		pages: book.pages,
	}
});

console.log(readingSummary);

/*-------------------------------------- Problem-0004 end (Objects - Structuring Your Data) --------------------------------------*/
