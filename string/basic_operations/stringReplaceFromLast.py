
def stringReplaceFromLast(stringToBeReplace,currentString):

	if len(currentString)>len(stringToBeReplace):
		print "string can't be replaced "
	else:
		pos = len(stringToBeReplace)-len(currentString)
		return stringToBeReplace[0:pos]+currentString


ack="xhxhxhxhxhxhxhxhxhxh"
ns="878"
print ack
print len(ack)
print '--------------------------'
print len(stringReplaceFromLast(ack,ns))
print stringReplaceFromLast(ack,ns)











	
