# adapter-pattern

## What is adapter-pattern
The adapter pattern convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.

## why adapter design is a structural design pattern?.
Because its make two incompatible structure as compatible one.

## What problem does Adapter Pattern solves?
1. Consumer and provider are incompatible because both of then have different protocol.
2. Provider can have its own set of steps to be executed , before its gets consumed.These steps can vary provider to provider.
3. To consume provider, compatiblity code can not be added to inside consumer code.If we do so,if provider changes then consumer need to be changed.
4. To consume provider compatiblity can not be added to provider code, If we do so then 
if new consumer comes then provider needs to change code for new consumer.

If the consumer can not have compatible code , and vice versa Provider can not have compatiblity code,
Who will do it? Adapter design pattern do it.

Example:
DownloaderApp -> Googledapter->GoogleDrive
DownloaderApp->DropboxAdapter->Dropbox

## Advange of Adapter pattern.
1. Make two different set of code compatible for each other.
2. consumer and provider code can be run independently without worring how to interact each other. 
3. helps to achieve single responsiblity principle.

## when to use adapter pattern?.
1. when you have an existing code or third party library whose interface is not compatible with your code.
2. Do you have different framework thats need to interact each other.

 

