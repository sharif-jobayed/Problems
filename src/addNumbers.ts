/*
Given a string "1234"
Display the sum of the digits
*/


const totalOfDigits = (numStr: string): number => {
	let total = 0;
	const chars = Array.from(numStr);

	for (const ch of chars) {
		const digit = Number(ch);
		if (!Number.isNaN(digit)) {
			total += digit;
		}
	}

	console.log(total);
	return total;
}

totalOfDigits('1234');
