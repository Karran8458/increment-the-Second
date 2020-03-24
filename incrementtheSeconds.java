function incrementTheSeconds(arr)
{
	for (var i = 1; i < arr.length; i=i+2)
	{
		arr[i]= arr[i]+1;
	}
	for (var i = 0; i < arr.length; i++)
	{
		console.log(arr[i]);
	}
	return arr;
}
