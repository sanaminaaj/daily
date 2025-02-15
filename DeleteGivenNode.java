static void deleteGivenNode(Node t) {
    if(t==null)
    return;
    t.num = t.next.num;
    t.next = t.next.next;
    return;
}
