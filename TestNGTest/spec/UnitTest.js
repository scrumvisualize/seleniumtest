describe("Testing Two Numbers", function() {
	
	
    it("Add Numbers", function() {
        expect(AddTwoNumbers(a,b)).toEqual(7);
    });
    
    it("Multiply Numbers", function() {
        expect(MultiplyTwoNumbers(a,b)).toEqual(12);
    });
 
    it("Compare Numbers to be Greater Than", function() {
    	expect(a).toBeGreaterThan(b);
    });
 
    it("Compare Numbers to be Less Than", function() {
    	expect(b).toBeLessThan(a);
    });
});