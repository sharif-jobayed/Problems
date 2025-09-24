

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

/*const myLibrary = [];

for (let i = 0; i < 15; i++) {
	myLibrary.push(
		{
			title: `Book ${i}`,
			author: `Writer ${i}`,
			pages: 15 * i,
			isRead: i % 2 === 0 // Simplified: directly assign boolean based on condition
		}
	);
}

console.log(myLibrary);

const finishedBooks = myLibrary.filter((book) => {
	return book.isRead; // Simplified: directly use the boolean property
});

const readingSummary = finishedBooks.map(book => {
	// Changed to return a string in the specified format
	return `${book.title} by ${book.author} is ${book.pages} pages long.`;
});

console.log(readingSummary); */

/*-------------------------------------- Problem-0004 end (Objects - Structuring Your Data) --------------------------------------*/

/*-------------------------------------- Problem-0005 start (Asynchronous JavaScript) --------------------------------------*/



// This function returns a promise
/* const orderPizza = () => {
	return new Promise((resolve, reject) => {
		// Simulating a network request
		setTimeout(() => {
			const pizzaIsReady = true;
			if (pizzaIsReady) {
				resolve("Your delicious pizza!"); // Fulfill the promise
			} else {
				reject("The oven broke!"); // Reject the promise
			}
		}, 2000);
	});
}

console.log("Ordering pizza...");
orderPizza()
	.then(result => {
		// This runs if the promise is resolved
		console.log("Success:", result);
	})
	.catch(error => {
		// This runs if the promise is rejected
		console.log("Failure:", error);
	})
	.finally(() => {
		// This runs regardless of success or failure
		console.log("The transaction is complete.");
	});

console.log("Watching TV while waiting..."); */


/*----------------------------------------------------*/

/* const fetchUserData = (userId) => {
	return new Promise((resolve, reject) => {
		// Simulate network delay of 1.5 seconds (1500ms)
		setTimeout(() => {
			// Check if userId is a positive number
			if (typeof userId === 'number' && userId > 0) {
				// Resolve with the user object
				resolve({
					id: userId,
					name: 'John Doe',
					email: 'john.doe@example.com'
				});
			} else {
				// Reject with an Error object
				reject(new Error("Invalid User ID provided."));
			}
		}, 1500); // 1.5 seconds
	});
}

const displayUser = async () => {
	try {
		// Test with a valid ID
		console.log("Attempting to fetch user with ID 101...");
		const user101 = await fetchUserData(101);
		console.log(`User found: ${user101.name}`);

		// Test with an invalid ID (this will go to the catch block)
		console.log("\nAttempting to fetch user with ID 'abc'...");
		const userABC = await fetchUserData('abc'); // This will reject
		console.log(`User found: ${userABC.name}`); // This line won't be reached
	} catch (e) {
		// Catch and log the error
		console.error('Error:', e.message);
	}
}

displayUser(); // Call the async function to start the process */

/*-------------------------------------- Problem-0005 end (Asynchronous JavaScript) --------------------------------------*/

/*-------------------------------------- Problem-0006 start (Final Polish & Problem-Solving Strategy) --------------------------------------*/

/* const studentData = [
	{ name: "Alice", testScores: [85, 92, 78] },
	{ name: "Bob", testScores: [55, 60, 50] },
	{ name: "Charlie", testScores: [] }, // Has no scores
	{ name: "David", testScores: [95, 88, 97] },
	{ name: "Eve", testScores: [40, 55, 60] }
]; */

// Your function will go here

/*
Plan:
1. Create a function `processStudentData` that accepts the student array.
2. Filter the array to keep only students where `testScores.length > 0`.
3. Map over the filtered array. For each student:
		a. Calculate the sum of their scores. (Hint: .reduce() is great for this).
		b. Calculate the average.
		c. Create a new student object with name and averageScore.
		d. If the average is < 60, add `needsReview: true` to the object.
4. Return the new mapped array.
*/

/* const processStudentData = () => {
	const filteredStudents = studentData.filter((student) => {
		return student.testScores.length > 0;
	});
	const processedStudents = filteredStudents.map((student) => {
		const sumOfScores = student.testScores.reduce((acc, score) => {
			return acc + score;
		}, 0);
		const averageScore = sumOfScores / student.testScores.length;
		const newStudent = {
			name: student.name,
			averageScore
		};
		if (averageScore < 60) {
			newStudent.needsReview = true;
		}
		return newStudent;
	});
	return processedStudents;
}

console.log(processStudentData()); */



/*-------------------------------------- Problem-0006 end (Final Polish & Problem-Solving Strategy) --------------------------------------*/

/*-------------------------------------- Problem-0007 end (Array reduce method) --------------------------------------*/

/* const numArr1 = [1, 2, 3, 4];

const total = numArr1.reduce((accumulated, toAdd) => {
	return accumulated + toAdd;
}, 0);

console.log(total); */

// Sum up the total of the given number's digits without using reduce()
/* const makeTotal = (num) => {
	const digits = num.toString().split('');
	let total = 0;
	for (let i = 0; i < digits.length; i++) {
		total += parseInt(digits[i]);
	}
	return total;
}

console.log(makeTotal(1234)); */

/*-------------------------------------- Problem-0007 end (Array reduce method) --------------------------------------*/

/*-------------------------------------- Practice Problem 1: The E-commerce Shopping Cart --------------------------------------*/

const shoppingCart = [
	{ product: "Laptop", price: 1200, quantity: 1 },
	{ product: "Mouse", price: 25, quantity: 2 },
	{ product: "Keyboard", price: 75, quantity: 1 },
	{ product: "Monitor", price: 300, quantity: 2 }
];

// Your `calculateCartTotal` function here...
const calculateCartTotal = (objArr) => {
	/* let quants = 0;
	for (let item of objArr) {
		quants += item.quantity.valueOf();
	} */

	// Complete using map() & reduce()
	const itemQuantities = objArr.map((item) => {
		return item.quantity;
	});
	console.log(itemQuantities);

	const itemTotal = itemQuantities.reduce((acc, quant) => {
		return acc + quant;
	}, 0);
	console.log(itemTotal);

	const itemPrices = objArr.map((item) => {
		return item.price * item.quantity;
	});
	console.log(itemPrices);

	const total = itemPrices.reduce((acc, price) => {
		return acc + price;
	}, 0);
	console.log(total);

	return total;

}

calculateCartTotal(shoppingCart);


/*-------------------------------------- Practice Problem 1 End --------------------------------------*/

/*-------------------------------------- Practice Problem 2: Asynchronous Data Aggregator --------------------------------------*/

const bookIds = [101, 102, 103];
const badBookIds = [101, 'invalid_id', 103];

const fetchBookData = (bookId) => {
	// Your Promise logic here...
};

const getCombinedBookStats = async (ids) => {
	// Your async/await and Promise.all logic here...
};


/*-------------------------------------- Practice Problem 2 End --------------------------------------*/

/*-------------------------------------- Practice Problem 3: The Palindrome Checker --------------------------------------*/

/*
Plan:
1. Create a function `isPalindrome(str)`.
2. Sanitize the input string:
		a. Convert to lowercase.
		b. Remove all non-alphanumeric characters. (Hint: Regular Expressions are great for this: `str.replace(/[^a-z0-9]/g, "")`)
3. Create a reversed version of the sanitized string. (Hint: `.split('').reverse().join('')`)
4. Compare the sanitized string with its reversed version and return the result.
*/

const isPalindrome = (str) => {
	// Your logic here...
};

console.log(`"A man, a plan, a canal: Panama" is a palindrome: ${isPalindrome("A man, a plan, a canal: Panama")}`); // Expected: true
console.log(`"race a car" is a palindrome: ${isPalindrome("race a car")}`); // Expected: false


/*-------------------------------------- Practice Problem 3 End --------------------------------------*/
